package eerstePogingLabs.uitwerkingenHS10;

public class Employee extends Person{

    public Employee(String lastName) {
        super(lastName);
    }

    @Override
    public String greet() {
        return "I'm tired of working. This is inhuman!";
    }

}
