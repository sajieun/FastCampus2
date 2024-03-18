package Part5;

import java.util.Arrays;
import java.util.Random;

public class RandomAPI {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[6];
        int i = 0;
        while (i < 6) {
            int num = rand.nextInt(45) + 1;
            boolean isDuplicate = false;

            for (int j = 0; j < i; j++) {
                if (arr[j] == num) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                arr[i++] = num;
            }
        }

        Arrays.sort(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }

    }
}
