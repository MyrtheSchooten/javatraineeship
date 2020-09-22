package uitwerkingenHS7hw;

public class Start {

    public static void main(String[] args){
        Person p = new Person("Jan", 129);

        System.out.println(p.getGender());
        p.setGender(Gender.MALE);
        System.out.println(p.getGender());

        try {
            p.haveBirthday();
        } catch (PersonDiedExeption e) {
            System.err.println(e.getMessage());
        }
        System.out.println(p.getAge());

        System.out.println(Person.numberOfPossibleGenders);


    }

    protected void finalize() throws Throwable {
        super.finalize(); }


    }
