public class WholeNumb {
    public static void main(String... args) {
        /*
        Имеется целое число, определить является ли это число простым, т.е.
        делится без остатка только на 1 и себя.
         */
        int a = 4;
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                System.out.println(a + " Число не простое");
                return;
            }else{
                System.out.println(a+" Число простое");
            }
        }
    }
}





