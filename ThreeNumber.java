public class ThreeNumber {
    public static void main(String[] args) {
        /*Найдите сумму первых n целых чисел, которые делятся на 3.
         */
        int number = 2;
        int sum = 0;
        int counter=0;
        for (int j = 1; j > 0; j++) {
            if (j % 3 == 0) {
                sum += j;
                counter++;
            }
            if (counter == number) {
                break;

            }

        }
        System.out.println(sum);

    }


}



