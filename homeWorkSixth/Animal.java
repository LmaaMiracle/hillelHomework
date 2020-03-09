package yarchuk;

abstract class Animal implements AnimalsBehaviour {

    private int id;
    private int age;
    private int weight;
    private String colour;

    public Animal(int id, int age, int weight, String colour) {
        this.id = id;
        this.age = age;
        this.weight = weight;
        this.colour = colour;
    }

    @Override
    public String voice() {
        return null;
    }

    @Override
    public String move() {
        return null;
    }

    @Override
    public String eat() {
        return null;
    }
}
