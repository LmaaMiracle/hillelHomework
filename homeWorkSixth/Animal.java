package yarchuk;

public class Animal implements AnimalsBehaviour {

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


    //Так как мы логически не можем вызвать метод (допустим) голос у класса "Животное" (т.к. а что говорит ЖИВОТНОЕ?)
    //то я решил сделать в суперклассе просто заглушки для всех методов, которые мы имплементируем, дабы далее
    //переопределить и написать реализацию в дочерних классах
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
