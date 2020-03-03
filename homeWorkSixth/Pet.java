package yarchuk;

public class Pet extends Animal {

    private String name;
    private boolean vaccinated;

    public Pet(int id, String name, int age, int weight, boolean vaccinated, String colour) {
        super(id, age, weight, colour);
        this.name = name;
        this.vaccinated = vaccinated;
    }

    public String getResponseOnName(String str) {
        if(str.equals(getName())){
            return voice();
        }
        return "Zzz";
    }

    public boolean isVaccinated() {
        return vaccinated;
    }

    public String getName() {
        return name;
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
}
