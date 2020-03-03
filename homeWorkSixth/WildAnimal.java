package yarchuk;

public class WildAnimal extends Animal{

    private boolean predator;

    public WildAnimal(int id, int age, int weight, boolean predator, String colour) {
        super(id, age, weight, colour);
        this.predator = predator;
    }

    public boolean isPredator() {
        return predator;
    }

    @Override
    public String voice() {
        if(predator) {
            return super.voice() + "I'm wild animal, and I'm angry!";
        }
        return super.voice() + "I'm wild animal!";
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
