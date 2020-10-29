package eerstePogingLabs.uitwerkingenHS10;

public class Person extends Human {

    private final String lastName;


    public Person(String lastName) {
        this.lastName = lastName;
    }


    @Override
    public String greet() {
        return "Hello, my name is " + lastName + ". Nice to meet you!";
    }
}

