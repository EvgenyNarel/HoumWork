public class SumMas {
    public static void main(String... args) {
        /*
        Определите сумму элементов одномерного массива, расположенных между
        минимальным и максимальным значениями.
         */
        int ocen[] = {5, 1, 3, 2,10,9};

        int max = 0;
        int numbermax=0;
        int numbermin=0;
        for (int i = 0; i < ocen.length; i++) {
            System.out.print(ocen[i] + " ");
            if (ocen[i] > max) {
                max = ocen[i];
                numbermax=i;
            }
        }
        int min = max;
        for (int i = 0; i < ocen.length; i++) {
            if (ocen[i] < min) {
                min = ocen[i];
                numbermin=i;
            }
        }
        int sum=0;
        for(int i =0; i <ocen.length; i++){
            if(i>numbermin&&i<numbermax){
                sum+=ocen[i];
                System.out.println("\n["+i+"]");
            }

            }
        System.out.println(sum);

        System.out.println("\nМинимальная оценка " + min+" номер в списке "+numbermin);
        System.out.println("\nМаксимаьная оценка " + max+" номер в списке "+numbermax);
    }
}

