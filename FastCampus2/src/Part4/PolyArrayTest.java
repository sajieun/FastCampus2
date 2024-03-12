package Part4;

import Part4.model.Animal;
import Part4.model.Cat;
import Part4.model.Dog;

public class PolyArrayTest {
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();
        // Dog, Cat 을 저장할 배열을 생성
//        Animal[] ani = {new Dog(), new Cat()} 이렇게 한 줄로 써도된다.
        Animal[] ani = new Animal[2];
        ani[0] = d;
        ani[1] = c;
        display(ani);


    }

    private static void display(Animal[] ani) {
        for(int i=0;i<ani.length;i++){
            ani[i].eat();
            if (ani[i] instanceof Cat){
                ani[i].night();
            }
        }
    }
}
