package yarchuk;

public class Animal {

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

    public String voice() {
        return "Hello, ";
    }

    public String move() {
        return "I'm moving!";
    }

    public String eat() {
        return "I'm eating!";
    }

}
