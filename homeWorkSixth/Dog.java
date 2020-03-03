package yarchuk;

public class Dog extends Pet {

    public Dog(int id, String name, int age, int weight, boolean vaccinated, String colour) {
        super(id, name, age, weight, vaccinated, colour);
    }

    @Override
    public String getResponseOnName(String str) {
        return super.getResponseOnName(str);
    }

    @Override
    public boolean isVaccinated() {
        return super.isVaccinated();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String voice() {
        return super.voice() + ", Woof!";
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
