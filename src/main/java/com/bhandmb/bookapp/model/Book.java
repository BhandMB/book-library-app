package com.bhandmb.bookapp.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "books")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Title is required")
    @Size(max = 255)
    @Column(nullable = false)
    private String title;

    @NotBlank(message = "Author is required")
    @Size(max = 150)
    @Column(nullable = false)
    private String author;

    @NotBlank(message = "ISBN is required")
    @Column(unique = true, nullable = false)
    private String isbn;

    @Min(1000) @Max(2100)
    private Integer publishedYear;

    @Size(max = 100)
    private String genre;

    @DecimalMin("0.0") @DecimalMax("5.0")
    private Double rating;

    @Size(max = 1000)
    private String description;

    @Builder.Default
    private Boolean available = true;

    @Column(updatable = false)
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    @PrePersist protected void onCreate() {
        createdAt = LocalDateTime.now(); updatedAt = LocalDateTime.now();
    }
    @PreUpdate protected void onUpdate() {
        updatedAt = LocalDateTime.now();
    }
}
