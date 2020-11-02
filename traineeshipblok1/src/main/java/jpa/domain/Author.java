package jpa.domain;

import jpa.util.BooleanTFConverter;

import javax.persistence.*;

import java.util.ArrayList;
import java.util.List;

import static javax.persistence.FetchType.LAZY;

@Entity
@NamedQuery(name = "Employee.findAll", query = "select e from Author e")
public class Author {
    @Id
    @GeneratedValue
    private long id;

    private String lastName;

    @Enumerated(value = EnumType.STRING)
    private Genre genre;

    @Convert(converter = BooleanTFConverter.class)
    private Boolean hasDebuted = false;

    @Lob
    @Basic(fetch = LAZY)
    private String biography;

    @ManyToOne(cascade = CascadeType.MERGE)
    private Publisher signedBy;

    @ManyToOne
    private Assistant assistant;

    @OneToMany(mappedBy = "author")
    private List<Book> books = new ArrayList<>();

    public Author() {}

    public Author(String lastName) {
        this.lastName = lastName;
        this.genre = Genre.UNKNOWN;
    }

    public long getId() {return id;}

    public void setName(String name) {this.lastName = name;}

    public void setGenre(Genre genre) {this.genre = genre;}

    public void setSignedBy(Publisher signedBy) {this.signedBy = signedBy;}

    public void setHasDebuted(Boolean hasDebuted) {this.hasDebuted = hasDebuted;}

    public void setBiography(String biography) {this.biography = biography;}

    public void setAssistant(Assistant assistant) {
        this.assistant = assistant;
        this.assistant.addAuthor(this);
    }

    public List<Book> getBooks() {
        return books;
    }

}
