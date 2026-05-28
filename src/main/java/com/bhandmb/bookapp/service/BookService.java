package com.bhandmb.bookapp.service;

import com.bhandmb.bookapp.exception.BookNotFoundException;
import com.bhandmb.bookapp.model.Book;
import com.bhandmb.bookapp.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class BookService {

    private final BookRepository bookRepository;

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Book getById(Long id) {
        return bookRepository.findById(id)
                .orElseThrow(() -> new BookNotFoundException(id));
    }

    public List<Book> search(String query) {
        if (query == null || query.isBlank()) return getAllBooks();
        return bookRepository.search(query.trim());
    }

    public List<Book> getAvailable() {
        return bookRepository.findByAvailable(true);
    }

    public Book save(Book book) {
        return bookRepository.save(book);
    }

    public Book update(Long id, Book updated) {
        Book existing = getById(id);
        existing.setTitle(updated.getTitle());
        existing.setAuthor(updated.getAuthor());
        existing.setIsbn(updated.getIsbn());
        existing.setPublishedYear(updated.getPublishedYear());
        existing.setGenre(updated.getGenre());
        existing.setRating(updated.getRating());
        existing.setDescription(updated.getDescription());
        existing.setAvailable(updated.getAvailable());
        return bookRepository.save(existing);
    }

    public void delete(Long id) {
        getById(id); // throws if not found
        bookRepository.deleteById(id);
    }

    public void toggleAvailability(Long id) {
        Book book = getById(id);
        book.setAvailable(!book.getAvailable());
        bookRepository.save(book);
    }

    public long count() {
        return bookRepository.count();
    }

    public long countAvailable() {
        return bookRepository.findByAvailable(true).size();
    }
}
