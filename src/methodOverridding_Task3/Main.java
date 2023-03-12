package methodOverridding_Task3;

public class Main {


    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();

        animal.speak(); // The animal speaks
        dog.speak(); // The dog barks
        cat.speak(); // The cat meows
    }

}
