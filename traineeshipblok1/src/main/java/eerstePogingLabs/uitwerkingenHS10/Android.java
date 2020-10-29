package eerstePogingLabs.uitwerkingenHS10;

public class Android extends Human implements Charchable {

    int level;

    public Android(int level) {
        this.level = level;

    }

    @Override
    public String greet() {
        return ("I'm only half human but human still... My energy level is " + level + "%.");
    }

    @Override
    public int charge(int amount) {
        if(level + amount <= 100){
            level = level + amount;
            return level;
        } level += amount;
        return level;
    }
}
