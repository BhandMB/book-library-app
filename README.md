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

Open your browser at **http://localhost:8081**

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
- Username: `sa` | Password: *(empty)*
  
