package yarchuk;

public class Wolf extends WildAnimal {

    public Wolf(int id, boolean isPredator, int age, int weight, String colour) {
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
