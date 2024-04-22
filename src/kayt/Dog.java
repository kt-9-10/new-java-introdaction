package kayt;

public class Dog extends Animal {

    public Dog(String picture, String name, int age) {
        super(picture, name, age);
    }

    @Override
    public void move() {
        System.out.println("Dog is runnning!");
    }

    @Override
    public void makeSound() {
        System.out.println("Woof");
    }
}
