package yarchuk;

public class GuideDog extends Animal implements GuideDogsBehaviour {
    private boolean trained;

    public GuideDog(int id, int age, boolean trained, int weight, String colour) {
        super(id, age, weight, colour);
        this.trained = trained;
    }

    public boolean isTrained() {
        return trained;
    }

    @Override
    public String takeHome() {
        return "Going home! I know the way!";
    }

    @Override
    public String voice() {
        if (trained) {
            return super.voice() + "I can take you home, woof!";
        }
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
