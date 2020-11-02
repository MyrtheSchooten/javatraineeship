package jpa.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Assistant {
    @Id
    @GeneratedValue
    private long id;

    private String nameAssistant;

    public Assistant() { }

    public Assistant(String nameAssistant) {
        this.nameAssistant = nameAssistant;
    }

    @OneToMany(mappedBy = "assistant") // lazy loaded by default
    private List<Author> authors = new ArrayList<>();

    public List<Author> getEmployees() {
        return authors;
    }

    public void addAuthor(Author author) {
        this.authors.add(author);
    }
}
