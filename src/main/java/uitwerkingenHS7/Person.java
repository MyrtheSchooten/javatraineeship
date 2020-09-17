package uitwerkingenHS7;

public class Person {
    // attributes
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
        if (this.age >=  MAX_AGE) {
            throw new PersonDiedExeption();
        } else {
            this.age++;
        }
    }

    //GetAge
    public int getAge () {
        return age;
    }

    //GetGender
    public Gender getGender() {
        return gender;
    }
}

