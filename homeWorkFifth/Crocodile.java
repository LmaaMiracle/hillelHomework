package yarchuk;

public class Crocodile extends WildAnimal {

    public Crocodile(int id, boolean isPredator, int age, int weight, String colour) {
        super(id, isPredator, age, weight, colour);
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
