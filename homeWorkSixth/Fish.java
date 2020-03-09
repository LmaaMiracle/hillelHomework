package yarchuk;

public class Fish extends Animal {
    public Fish(int id, int age, int weight, String colour) {
        super(id, age, weight, colour);
    }

    @Override
    public String voice() {
        return "...?";
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
