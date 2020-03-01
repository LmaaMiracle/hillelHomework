package yarchuk;

public class Pet extends Animal {
    private String name;
    private boolean isVaccinated;

    public Pet(int id, String name, int age, int weight, boolean isVaccinated, String colour) {
        super(id, age, weight, colour);
        this.name = name;
        this.isVaccinated = isVaccinated;
    }

    public String getResponseOnName(String str) {
        if(str.equals(getName())){
            return voice();
        }
        return "Zzz";
    }

    @Override
    public String voice() {
        return super.voice() + "my name is " + getName();
    }

    @Override
    public String move() {
        return super.move();
    }

    @Override
    public String eat() {
        return super.eat();
    }

    public String getName() {
        return name;
    }
}
