package uitwerkingenHS10;

public class Person extends Human {

    private final String lastName;


    public Person(String lastName) {
        this.lastName = lastName;

    }

    @Override
    public void greet() {
        System.out.println("Hello, my name is " + lastName + ". Nice to meet you!");
    }
}

