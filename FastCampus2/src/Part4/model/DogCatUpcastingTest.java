package Part4.model;

public class DogCatUpcastingTest {
    public static void main(String[] args) {
        Animal ani = new Dog();
        ani.eat();
        ani.night();

        ani = new Cat();
        ani.eat();
        ani.night();
    }
}
