package entities;

import java.time.LocalDate;
import java.util.Objects;

public class Book {
    private Integer id;
    private String title;
    private Author author;
    private Boolean available;
    private LocalDate dateRegister;
    private LocalDate dateUpdate;

    public Book(){}

    public Book(Integer id, String title, Author author, Boolean available, LocalDate dateRegister, LocalDate dateUpdate) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.available = available;
        this.dateRegister = dateRegister;
        this.dateUpdate = dateUpdate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getDateUpdate() {
        return dateUpdate;
    }

    public void setDateUpdate(LocalDate dateUpdate) {
        this.dateUpdate = dateUpdate;
    }

    public LocalDate getDateRegister() {
        return dateRegister;
    }

    public void setDateRegister(LocalDate dateRegister) {
        this.dateRegister = dateRegister;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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
}
