// Superclass representing a generic Animal
class Animal {
    int age;
    String gender;

    // Parameterized constructor for Animal
    public Animal(int age, String gender) {
        this.age = age;
        this.gender = gender;
    }

    // Method to check if the animal is a mammal
    public void isMammal() {
        System.out.println("This animal is a mammal: " + (this instanceof Zebra));
    }

    // Method representing the mating behavior
    public void mate() {
        System.out.println("Animal is mating.");
    }
}

// Subclass representing a Duck
class Duck extends Animal {
    String beakColor;

    // Parameterized constructor for Duck
    public Duck(int age, String gender, String beakColor) {
        super(age, gender); // Call the superclass constructor
        this.beakColor = beakColor;
    }

    // Method specific to Duck for swimming
    public void swim() {
        System.out.println("Duck is swimming.");
    }

    // Method for duck sound
    public void quack() {
        System.out.println("Duck is quacking.");
    }
}

// Subclass representing a Fish
class Fish extends Animal {
    int sizeInFt;
    boolean canEat;

    // Parameterized constructor for Fish
    public Fish(int age, String gender, int sizeInFt, boolean canEat) {
        super(age, gender); // Call the superclass constructor
        this.sizeInFt = sizeInFt;
        this.canEat = canEat;
    }

    // Method specific to Fish for swimming
    public void swim() {
        System.out.println("Fish is swimming.");
    }
}

// Subclass representing a Zebra
class Zebra extends Animal {
    boolean isWild;

    // Parameterized constructor for Zebra
    public Zebra(int age, String gender, boolean isWild) {
        super(age, gender); // Call the superclass constructor
        this.isWild = isWild;
    }

    // Method specific to Zebra for running
    public void run() {
        System.out.println("Zebra is running.");
    }
}

// Test class to create and use objects of Animal and its subclasses
public class AnimalTest {
    public static void main(String[] args) {
        // Creating a Duck object
        Duck duck = new Duck(2, "Female", "yellow");

        // Creating a Fish object
        Fish fish = new Fish(1, "Male", 3, true);

        // Creating a Zebra object
        Zebra zebra = new Zebra(5, "Female", true);

        // Testing Duck methods
        System.out.println("Duck");
        duck.isMammal();
        duck.mate();
        duck.swim();
        duck.quack();

        // Testing Fish methods
        System.out.println("\nFish");
        fish.isMammal();
        fish.mate();
        fish.swim();

        // Testing Zebra methods
        System.out.println("\nZebra");
        zebra.isMammal();
        zebra.mate();
        zebra.run();
    }
}
