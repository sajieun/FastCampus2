package Part3.ClassDTO;

public class NoneStaticTest {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        NoneStaticTest st = new NoneStaticTest();
        int sum = st.hap(10,20);
        System.out.println("sum = " + sum);

    }
    public int hap(int a, int b){
        int v = a+b;
        return v;
    }
}
