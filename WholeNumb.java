public class WholeNumb {
    public static void main(String... args) {
        /*
        Имеется целое число, определить является ли это число простым, т.е.
        делится без остатка только на 1 и себя.
         */

        int counter = 0;
        int cheslo = 25;
        for (int i = 1; i < cheslo; i++) {
            for (int j = 1; j <= i; j++) {
                if ((cheslo % i == 0)) {
                    counter++;
                }
            }
        }
        if (counter < 2) {
            System.out.println("Число простое");
        } else {
            System.out.println("Число не простое");
        }
    }
}





