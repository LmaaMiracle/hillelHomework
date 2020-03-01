package yarchuk;

public class Cat extends Pet {

    public Cat(int id, String name, int age, int weight, boolean isVaccinated, String colour) {
        super(id, name, age, weight, isVaccinated, colour);
    }

    @Override
    public String getResponseOnName(String str) {
        return super.getResponseOnName(str);
    }

    @Override
    public String voice() {
        return super.voice();
    }

    @Override
    public String move() {
        return super.move() + "meow!";
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
