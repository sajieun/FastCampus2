package Part3.ClassDTO;

public class PersonTest {
    public static void main(String[] args) {
//        if 다른 디렉토리에 떨어져 있으면 Person 앞에 디렉토리 경로를 써줘야한다.
//        [ 인스턴스 만드는 과정 ]
        Person p = new Person();
        p.name = "jieun";
        p.age = 24;
        p.phone = "010-5555_5555";

        Person p1 = new Person();
        p.name = "jieunsa";
        p.age = 27;
        p.phone = "010-5555_5566";

        System.out.println(p.name);
        System.out.println(p.age);
        System.out.println(p.phone);
        p.play();
        p.eat();
        p.walk();
    }
}
