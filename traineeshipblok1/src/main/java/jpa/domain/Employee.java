package jpa.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employee {
    @Id
    @GeneratedValue
    private long id;

    private String name;
    private int age;

    public Employee() { }

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public long getId() {
        return id;
    }

    @Override public String toString() {
        return "Employee{ id = " + id + ", name = " + name + ", age = " + age + "}";
    }
}
