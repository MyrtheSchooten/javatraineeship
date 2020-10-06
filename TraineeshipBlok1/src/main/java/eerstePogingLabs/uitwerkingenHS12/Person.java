package eerstePogingLabs.uitwerkingenHS12;

import eerstePogingLabs.uitwerkingenHS7hw.Gender;
import eerstePogingLabs.uitwerkingenHS7hw.PersonDiedExeption;

import java.util.Objects;

public class Person {
    private String name;
    private int age;
    private Gender gender;

    public static final int MAX_AGE = 129;
    public static final int numberOfPossibleGenders = Gender.values().length;

    // constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.gender = Gender.UNKNOWN;
    }

    // SetGender
    public void setGender(Gender gender) {
        this.gender = gender;
    }

    // Birthday
    public void haveBirthday() throws PersonDiedExeption {
        if (this.age >= MAX_AGE) {
            throw new PersonDiedExeption();
        } else {
            this.age++;
        }
    }

    //GetAge
    public int getAge() {
        return age;
    }

    //GetGender
    public Gender getGender() {
        return gender;
    }

    //toStringMethode
    public String toString() {
        return name + "(" + age + ") is " + gender + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name) &&
                gender == person.gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, gender);
    }

}
