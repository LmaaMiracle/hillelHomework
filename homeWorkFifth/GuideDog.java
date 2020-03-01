package yarchuk;

public class GuideDog extends Dog {

    private boolean isTrained;

    public GuideDog(int id, String name, boolean isTrained, int age, int weight, boolean isVaccinated, String colour) {
        super(id, name, age, weight, isVaccinated, colour);
        this.isTrained = isTrained;
    }

    @Override
    public String getResponseOnName(String str) {
        return super.getResponseOnName(str);
    }

    @Override
    public String voice() {
        if (!isTrained) {
            return super.voice();
        }
        return super.voice() + "I can take you home, woof!";
    }

    @Override
    public String move() {
        return super.move();
    }

    @Override
    public String eat() {
        return super.eat();
    }

    @Override
    public String getName() {
        return super.getName();
    }
}
