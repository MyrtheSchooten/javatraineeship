package uitwerkingenHS10;

public class Start {

    public static void main(String[] args) {

        Human mens = new Person("Achternaam");
        Android android = new Android(80);
        Human employee = new Employee("HardeWerker");
        Human teacher = new Teacher("Leraar");

       mens.greet();
       android.greet();
       employee.greet();
       teacher.greet();

       android.charge(2);
       android.greet();

    }
}
