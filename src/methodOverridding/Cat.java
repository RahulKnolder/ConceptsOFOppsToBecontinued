package methodOverridding;

class Cat extends Animal {
    @Override
    public void speak() {
        System.out.println("The cat meows");
    }
}