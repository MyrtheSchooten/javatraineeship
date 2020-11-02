package jpa.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
public class Publisher {
    @Id
    @GeneratedValue
    private long id;

    private String name;

    public Publisher() {
    }

    public Publisher(String name) {
        this.name = name;
    }

    @Override public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Publisher that = (Publisher) o;
        return Objects.equals(name, that.name);
    }

    @Override public int hashCode() {
        return Objects.hash(name);
    }
}
