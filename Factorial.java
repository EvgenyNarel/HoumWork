public class Factorial {
    public static void main(String... args) {
        /*
        Изменить пример с суммой чисел таким образом, чтобы рассчитывалась не сумма, а
        произведение, т.е. факториал числа.
         */
        double sum = 1;


        int x = (int) (Math.random() * 5);

        System.out.println(x + " До цикла");
        if (x != 0) {
            for (int i = 1; i <=x; i++) {
                sum =sum*i;
               }
        } else {
            System.out.println("Попробуйте еще раз");
        }
        System.out.println("Факториал числа " + x + " равен " + sum);
    }
}

