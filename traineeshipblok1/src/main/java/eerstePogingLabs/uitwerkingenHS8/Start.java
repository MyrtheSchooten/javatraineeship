package eerstePogingLabs.uitwerkingenHS8;

import eerstePogingLabs.uitwerkingenHS7hw.Gender;

public class Start {
    public static void main(String[] args) {

        Person a = new Person("Aa", 25);
        a.setGender(Gender.FEMALE);

        Person b = new Person("Bee", 23);
        b.setGender(Gender.MALE);

        Person c = new Person("Cee", 22);
        c.setGender(Gender.FEMALE);

        Person d = new Person("Dee", 30);
        d.setGender(Gender.MALE);

        System.out.println(a.toString());
        System.out.println(a.hashCode());
        System.out.println(a.equals(b));

        System.out.println();

        System.out.println(b.toString());
        System.out.println(b.hashCode());
        System.out.println(b.equals(c));

        System.out.println();

        System.out.println(c.toString());
        System.out.println(c.hashCode());
        System.out.println(c.equals(d));

        System.out.println();

        System.out.println(d.toString());
        System.out.println(d.hashCode());
        System.out.println(d.equals(d));




    }
}
