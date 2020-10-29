package eerstePogingLabs.uitwerkingenHS13;

import eerstePogingLabs.uitwerkingenHS10.Person;


public class Start {

    public static void main(String[] args) {
        //House<Android> ha;
        // House<Person> hp;

        //House<String> hs;

        Person henk = new Person("Achternaam");
        House<Person> ha = new House<>(henk);

        System.out.println(ha.toString());

    }

}
