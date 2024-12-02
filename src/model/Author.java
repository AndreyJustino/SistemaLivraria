package model;

import java.time.LocalDate;
import java.util.Objects;
import java.util.UUID;

public class Author {
    private UUID id;
    private String name;
    private LocalDate birth;

    public Author() {
    }

    public Author(String name, LocalDate birth) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.birth = birth;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(name, author.name) && Objects.equals(birth, author.birth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birth);
    }
}
