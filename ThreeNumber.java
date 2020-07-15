public class ThreeNumber {
    public static void main(String[] args) {
        /*Найдите сумму первых n целых чисел, которые делятся на 3.
         */

        int sum = 0;
        int c;
        int n = 10;
        for (int i = 1; i < n; i++) {
            c = i % 3;
            if (c == 0) {
                sum = sum + i;

            }

        }
        System.out.println(sum);

    }


}



