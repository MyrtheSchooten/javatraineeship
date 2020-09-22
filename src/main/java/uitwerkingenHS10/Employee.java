package uitwerkingenHS10;

public class Employee extends Person{

    public Employee(String lastName) {
        super(lastName);
    }

    @Override
    public void greet() {
        System.out.println("I'm tired of working. This is inhuman!");
    }

}
