package yarchuk;

public class WildAnimal extends Animal {

    private boolean isPredator;

    public WildAnimal(int id, boolean isPredator, int age, int weight, String colour) {
        super(id, age, weight, colour);
        this.isPredator = isPredator;
    }

    @Override
    public String voice() {
        if(!isPredator) {
            return super.voice() + "I'm wild animal!";
        }
        return super.voice() + "I'm wild animal, and I'm angry!";
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
