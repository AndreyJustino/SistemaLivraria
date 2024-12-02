package model;

import java.time.LocalDate;
import java.util.Objects;
import java.util.UUID;

public class Book {
    private UUID id;
    private String title;
    private Author author;
    private Boolean available;
    private LocalDate dateRegister;
    private LocalDate dateUpdate;

    public Book(){}

    public Book(String title, Author author, Boolean available, LocalDate dateRegister, LocalDate dateUpdate) {
        this.id = UUID.randomUUID();
        this.title = title;
        this.author = author;
        this.available = available;
        this.dateRegister = dateRegister;
        this.dateUpdate = dateUpdate;
    }

    public UUID getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public LocalDate getDateRegister() {
        return dateRegister;
    }

    public void setDateRegister(LocalDate dateRegister) {
        this.dateRegister = dateRegister;
    }

    public LocalDate getDateUpdate() {
        return dateUpdate;
    }

    public void setDateUpdate(LocalDate dateUpdate) {
        this.dateUpdate = dateUpdate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author);
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author=" + author +
                ", available=" + available +
                ", dateRegister=" + dateRegister +
                ", dateUpdate=" + dateUpdate +
                '}';
    }
}
