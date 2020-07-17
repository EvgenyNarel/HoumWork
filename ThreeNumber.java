public class ThreeNumber {
    public static void main(String[] args) {
        /*Найдите сумму первых n целых чисел, которые делятся на 3.
         */

        int sum = 0;
        int i = 0;
        for(int j=0;j<3;j++) {
            if (i % 3 == 0) {
                sum += i;
            }
            i += 3;

        }
        System.out.println(sum);

    }


}



