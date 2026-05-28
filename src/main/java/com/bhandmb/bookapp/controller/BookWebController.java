package com.bhandmb.bookapp.controller;

import com.bhandmb.bookapp.model.Book;
import com.bhandmb.bookapp.service.BookService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class BookWebController {

    private final BookService bookService;

    // ── Home / list ────────────────────────────────────────────────────────
    @GetMapping("/")
    public String home(Model model,
                       @RequestParam(required = false) String search,
                       @RequestParam(required = false) Boolean availableOnly) {

        List<Book> books;
        if (search != null && !search.isBlank()) {
            books = bookService.search(search);
        } else if (Boolean.TRUE.equals(availableOnly)) {
            books = bookService.getAvailable();
        } else {
            books = bookService.getAllBooks();
        }

        model.addAttribute("books", books);
        model.addAttribute("search", search);
        model.addAttribute("availableOnly", availableOnly);
        model.addAttribute("totalBooks", bookService.count());
        model.addAttribute("availableCount", bookService.countAvailable());
        return "index";
    }

    // ── Detail view ────────────────────────────────────────────────────────
    @GetMapping("/books/{id}")
    public String detail(@PathVariable Long id, Model model) {
        model.addAttribute("book", bookService.getById(id));
        return "book-detail";
    }

    // ── Add form ───────────────────────────────────────────────────────────
    @GetMapping("/books/new")
    public String newForm(Model model) {
        model.addAttribute("book", new Book());
        model.addAttribute("formTitle", "Add New Book");
        return "book-form";
    }

    @PostMapping("/books/new")
    public String create(@Valid @ModelAttribute Book book,
                         BindingResult result,
                         Model model,
                         RedirectAttributes redirectAttrs) {
        if (result.hasErrors()) {
            model.addAttribute("formTitle", "Add New Book");
            return "book-form";
        }
        bookService.save(book);
        redirectAttrs.addFlashAttribute("successMsg", "Book \"" + book.getTitle() + "\" added successfully!");
        return "redirect:/";
    }

    // ── Edit form ──────────────────────────────────────────────────────────
    @GetMapping("/books/{id}/edit")
    public String editForm(@PathVariable Long id, Model model) {
        model.addAttribute("book", bookService.getById(id));
        model.addAttribute("formTitle", "Edit Book");
        return "book-form";
    }

    @PostMapping("/books/{id}/edit")
    public String update(@PathVariable Long id,
                         @Valid @ModelAttribute Book book,
                         BindingResult result,
                         Model model,
                         RedirectAttributes redirectAttrs) {
        if (result.hasErrors()) {
            model.addAttribute("formTitle", "Edit Book");
            return "book-form";
        }
        bookService.update(id, book);
        redirectAttrs.addFlashAttribute("successMsg", "Book updated successfully!");
        return "redirect:/";
    }

    // ── Delete ─────────────────────────────────────────────────────────────
    @PostMapping("/books/{id}/delete")
    public String delete(@PathVariable Long id, RedirectAttributes redirectAttrs) {
        bookService.delete(id);
        redirectAttrs.addFlashAttribute("successMsg", "Book deleted.");
        return "redirect:/";
    }

    // ── Toggle availability ────────────────────────────────────────────────
    @PostMapping("/books/{id}/toggle")
    public String toggle(@PathVariable Long id, RedirectAttributes redirectAttrs) {
        bookService.toggleAvailability(id);
        redirectAttrs.addFlashAttribute("successMsg", "Availability updated.");
        return "redirect:/";
    }
}
