package com.bhandmb.bookapp.repository;

import com.bhandmb.bookapp.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

    Optional<Book> findByIsbn(String isbn);

    List<Book> findByAvailable(Boolean available);

    @Query("SELECT b FROM Book b WHERE " +
           "LOWER(b.title) LIKE LOWER(CONCAT('%',:q,'%')) OR " +
           "LOWER(b.author) LIKE LOWER(CONCAT('%',:q,'%')) OR " +
           "LOWER(b.genre) LIKE LOWER(CONCAT('%',:q,'%'))")
    List<Book> search(@Param("q") String query);

    boolean existsByIsbn(String isbn);

    boolean existsByIsbnAndIdNot(String isbn, Long id);
}
