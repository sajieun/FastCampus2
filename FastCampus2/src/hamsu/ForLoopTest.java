package hamsu;


public class ForLoopTest {
    public static void main(String[] args) {

        for (char c ='A';c<='Z';c++){
            System.out.println(c+":"+(int)c);
        }

        int[] numbers={1,2,3,4,5,6,7,8,9,10};
        for (int i=0;i<numbers.length;i++){
            System.out.println(numbers[i]);
        }

//        foreach문
        for (int su : numbers){
            System.out.println(su);
        }
    }
}
