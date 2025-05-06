class Animal {
    public int age;
    public String gender;

    public Animal(int age, String gender) {
        this.age = age;
        this.gender = gender;
    }

    public boolean isMammal() {
        return false;
    }

    public void mate() {
        System.out.println("Animal is mating.");
    }
}

class Duck extends Animal {
    public String beakColor= "yellow";

    public Duck(int age, String gender, String beakColor) {
        super(age, gender);
        this.beakColor = beakColor;
    }

    public boolean isMammal() {
        return false;
    }

    public void mate() {
        System.out.println("Duck is mating.");
    }

    public void swim() {
        System.out.println("Duck swims in the pond.");
    }

    public void quack() {
        System.out.println("Duck goes quack!");
    }
}

class Fish extends Animal {
    private int sizeInFt;
    private boolean canEat;

    public int getSizeInFt() {
        return sizeInFt;
    }

    public boolean getCanEat() {
        return canEat;
    }


    public Fish(int age, String gender, int sizeInFt, boolean canEat) {
        super(age, gender);
        this.sizeInFt = sizeInFt;
        this.canEat = canEat;
    }

    public boolean isMammal() {
        return false;
    }

    public void mate() {
        System.out.println("Fish is mating.");
    }
    private void swim() {
        System.out.println("Fish swims in the water.");
    }
}

class Zebra extends Animal {
    public boolean is_wild;

    public Zebra(int age, String gender, boolean is_wild) {
        super(age, gender);
        this.is_wild = is_wild;
    }

    public boolean isMammal() {
        return true;
    }

    public void mate() {
        System.out.println("Zebra is mating.");
    }

    public void run() {
        System.out.println("Zebra runs fast on the plains.");
    }
}

public class Test {
    public static void main(String[] args) {
        Duck duck = new Duck(2, "male", "red");
        System.out.println("Duck is a mammal: " + duck.isMammal());
        duck.mate();
        System.out.println("Duck age: " + duck.age);
        System.out.println("Duck gender: " + duck.gender);
        duck.swim();
        duck.quack();

        Fish fish = new Fish(1, "Female", 2, true);
        System.out.println("Fish is a mammal: " + fish.isMammal());
        fish.mate();
        System.out.println("Fish age: " + fish.age);
        System.out.println("Fish gender: " + fish.gender);
        System.out.println("Fish size in feet: " + fish.getSizeInFt());
        System.out.println("Fish can eat: " + fish.getCanEat());
 

        Zebra zebra = new Zebra(4, "male", true);
        System.out.println("Zebra is a mammal: " + zebra.isMammal());
        zebra.mate();
        System.out.println("Zebra age: " + zebra.age);
        System.out.println("Zebra gender: " + zebra.gender);
        System.out.println("Zebra is wild: " + zebra.is_wild);
        zebra.run();

    }
}
