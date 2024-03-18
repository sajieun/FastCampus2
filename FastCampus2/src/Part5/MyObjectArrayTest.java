package Part5;

import Part5.model.B;
import Part5.model.A;
import Part5.model.C;
import Part5.model.ObjectArray;

public class MyObjectArrayTest {
    public static void main(String[] args) {
        ObjectArray list = new ObjectArray();
        list.add(new A());
        list.add(new B());
        list.add(new C());

        A a=(A)list.get(0);
        a.display();

        B b=(B) list.get(1);
        b.display();

        C c=(C)list.get(2);
        c.display();

        for (int i=0;i< list.size();i++){
            if (list.get(i) instanceof A){
                ((A)list.get(i)).display();
            }else if (list.get(i) instanceof B){
                ((B)list.get(i)).display();
            }else ((C)list.get(i)).display();
        }
    }
}
