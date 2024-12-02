package model;

import java.time.LocalDate;
import java.util.Objects;

public class Lend {
    private Integer idBook;
    private String name;
    private LocalDate dateLend;
    private LocalDate dateReturn;

    public Lend() {
    }

    public Lend(LocalDate dateLend, String name, Integer idBook, LocalDate dateReturn) {
        this.idBook = idBook;
        this.name = name;
        this.dateLend = dateLend;
        this.dateReturn = dateReturn;
    }

    public Integer getIdBook() {
        return idBook;
    }

    public void setIdBook(Integer idBook) {
        this.idBook = idBook;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateLend() {
        return dateLend;
    }

    public void setDateLend(LocalDate dateLend) {
        this.dateLend = dateLend;
    }

    public LocalDate getDateReturn() {
        return dateReturn;
    }

    public void setDateReturn(LocalDate dateReturn) {
        this.dateReturn = dateReturn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lend lend = (Lend) o;
        return Objects.equals(name, lend.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}
