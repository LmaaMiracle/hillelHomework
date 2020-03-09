package yarchuk;

public class Giraffe extends WildAnimal {

    public Giraffe(int id, int age, int weight, boolean predator, String colour) {
        super(id, age, weight, predator, colour);
    }

    @Override
    public boolean isPredator() {
        return super.isPredator();
    }

    @Override
    public String voice() {
        return super.voice();
    }

    @Override
    public String move() {
        return super.move();
    }

    @Override
    public String eat() {
        return super.eat();
    }
}

