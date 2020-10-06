package eerstePogingLabs.uitwerkingenHS11;

import eerstePogingLabs.uitwerkingenHS10.Human;
import eerstePogingLabs.uitwerkingenHS7hw.Gender;
import eerstePogingLabs.uitwerkingenHS7hw.PersonDiedExeption;

public class Person {

    private String name;
    private int age;
    private Gender gender;
    private HistoryRecord[] historyRecord = new HistoryRecord[50];
    private int historyRecordIndex = 0;

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

    public void addHistory(String descr) {
        this.historyRecord[historyRecordIndex++] = new HistoryRecord(descr);
    }


    public void printHistory() {
        for (int i = 0; i < historyRecordIndex; i++) {
            System.out.println(historyRecord[i]);
        }
    }


    public Human createSubHuman() {
        return new Human() {
            @Override
            public String greet() {
                return "Sub is the best.";
            }
        };
    }

    // Private inner class
    private class HistoryRecord {
        String description;

        public HistoryRecord(String description) {
            this.description = description;
        }

        @Override
        public String toString() {
            return description;
        }

    }

}

