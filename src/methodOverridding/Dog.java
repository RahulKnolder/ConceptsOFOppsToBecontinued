package methodOverridding;

class Dog extends Animal {
    @Override
    public void speak() {
        System.out.println("The dog barks");
    }
}