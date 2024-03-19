package Part5.ch04;

import Part5.ch04.model.CC;

// CC를 이용하여 BB를 동작시키는 프로그래밍 (인터페이스 기반의 프로그래밍)
public class InterfaceAPI {
    public static void main(String[] args) {
        CC c  = new BB();
        c.x();
        c.y();
        c.x();
        System.out.println("c = " + c);
    }
}
