package eerstePogingLabs.uitwerkingenHS13;

import eerstePogingLabs.uitwerkingenHS10.Human;

public class House<T extends Human> {
    private T owner;

    public House(T owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "This house is owned by " + owner + "and it says [" + owner.greet() + "]." ;
    }


}
