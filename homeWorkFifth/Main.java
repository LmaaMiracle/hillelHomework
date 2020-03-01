package yarchuk;

public class Main {

    public static void main(String[] args) {

        Dog dog = new Dog(1, "Josh", 3, 13, true, "brown");
        System.out.println(dog.voice());

        Wolf wolf = new Wolf(2, false, 5, 20, "white");
        System.out.println(wolf.voice());

        Cat cat = new Cat(1, "Kitty", 3, 13, true, "rainbow");
        System.out.println(cat.getResponseOnName("Kitt"));
    }
}
