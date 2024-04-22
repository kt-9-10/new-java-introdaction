package kayt;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Animal bengie = new Dog("bengie.png", "bengie", 9);
        Animal jeremy = new Dog("jeremy.png", "jeremy", 7);

        Animal whiskers = new Cat("whiskers.jpg", "whiskers", 5);

        Animal george = new Cat("george.jpg", "George", 3);

        Bird jules = new Bird("jules.png", "Jules", 1);
        jules.move();
        jules.fly();

        Animal joel = new Animal("joel.jpg", "Joel", 2) {
            @Override
            public void move() {
                    System.out.println("Hamster is running in the Wheel!");
            }

            @Override
            public void makeSound() {
                System.out.println("Very tiny hamster noises");
            }
        };

        List<Animal> animals = new ArrayList<>();
        animals.add(bengie);
        animals.add(jeremy);
        animals.add(whiskers);
        animals.add(george);
        animals.add(jules);
        animals.add(joel);

        List<IFlyable> flyables = new ArrayList<>();
        flyables.add(jules);
        flyables.add(new Airplane());

        for(Animal animal : animals) {
            animal.move();
            animal.makeSound();
        }

        for(IFlyable flyable : flyables) {
            flyable.fly();
        }

//        george.move();
//        jeremy.move();
//
//        System.out.println("Bengie age " + bengie.getAge());
//        System.out.println("Jeremy age " + jeremy.getAge());
//        System.out.println("Whiskers age " + whiskers.getAge());
//
//        bengie.birthday();
//
//        System.out.println("Bengie age " + bengie.getAge());
//        System.out.println("Jeremy age " + jeremy.getAge());
//
//        System.out.println("kayt.Cat Info: ");
//        whiskers.displayInfo();
//        whiskers.makeSound();
//
//        System.out.println("kayt.Dog Info: ");
//        jeremy.displayInfo();
//        jeremy.makeSound();
    }
}