package Part4.model;

public class Cat extends Animal{

    @Override
    public void eat() {
        System.out.println("고양이 처럼 먹다.");
    }

    public void night(){
            System.out.println("밤에 눈에서 빛이 난다.");
    }
}
