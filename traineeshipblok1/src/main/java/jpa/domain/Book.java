package jpa.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Objects;

@Entity
public class Book {

    @Id
    @GeneratedValue
    private long id;

    private String title;

    public Book() {
    }

    public Book(String title) {
        this.title = title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id == book.id &&
                title.equals(book.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title);
    }

    @ManyToOne
    private Author author;

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        author = this.author;
    }

}
