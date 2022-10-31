package myPack;

public class Dog {
    public String breed;
    public int size;
    public int age;
    public String colour;

    public Dog(String breed, int size, int age, String colour) {
        this.breed = breed;
        this.size = size;
        this.age = age;
        this.colour = colour;
    }

    public Dog(){}

    public void eat()
    {
        System.out.println("eating....");
    }

    public void sleep()
    {
        System.out.println("sleeping...");
    }

    public void play()
    {
        System.out.println("playing...");
    }
}
