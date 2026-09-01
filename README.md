# 📚 Book Library App

A full-stack Book Library web application built with **Spring Boot 3**, **Thymeleaf**, and **H2** database. Provides a clean, responsive UI to browse, search, add, edit, and manage books.

## 🚀 Features

- 📖 **Browse** all books in a responsive card grid
- 🔍 **Search** books by title, author, or genre
- ✅ **Filter** by availability
- ➕ **Add** new books via a validated form
- ✏️ **Edit** existing books
- 🗑️ **Delete** books with confirmation
- 🔄 **Toggle availability** (Available / Checked Out)
- 📊 **Stats bar** showing total & available book counts
- 🌱 **6 seed books** loaded automatically on startup

## 🛠️ Tech Stack

| Layer | Technology |
|---|---|
| Framework | Spring Boot 3.2 |
| Language | Java 21 |
| UI | Thymeleaf + custom CSS |
| Persistence | Spring Data JPA + Hibernate |
| Database | H2 (in-memory) |
| Validation | Jakarta Bean Validation |
| Build | Maven |

## ▶️ Running the App

```bash
mvn spring-boot:run
```

Open your browser at **http://localhost:8081**.

## 📸 Pages

| Route | Description |
|---|---|
| `/` | Home — book grid, search, filter |
| `/books/new` | Add a new book |
| `/books/{id}` | Book detail view |
| `/books/{id}/edit` | Edit a book |
| `/books/{id}/delete` | Delete (POST) |
| `/books/{id}/toggle` | Toggle availability (POST) |

## 🧪 Running Tests

```bash
mvn test
```

## 🔍 H2 Console

Available at **http://localhost:8081/h2-console**

- JDBC URL: `jdbc:h2:mem:bookappdb`
- Username: `sa`
- Password: *(empty)*

## 🧭 Manual Verification Checklist

After starting the application, verify the main user flow:

- [ ] Home page loads and displays seeded books
- [ ] Search returns matching books
- [ ] Availability filter changes the displayed results
- [ ] New-book validation rejects invalid input
- [ ] A valid book can be created
- [ ] Existing books can be edited
- [ ] Delete requires the expected confirmation flow
- [ ] Availability can be toggled
- [ ] Book statistics update after changes

## 📌 Development Notes

Keep the README and application configuration aligned when changing the Java version, Spring Boot version, or server port. Documentation was refreshed on **September 1, 2026** with a manual verification checklist for the core UI workflow.
