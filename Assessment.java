public class Assessment {
    public static void main(String[] args) {
        /*Создать массив оценок произвольной длины, вывести максимальную и
         минимальную оценку, её (их) номера.*/
        int ocen[] = {1, 2, 3, 4, 1, 10, 7, 8, 9, 6};
        int max = 0;
        int numbermax=0;
        int numbermin=0;
        for (int i = 0; i < ocen.length; i++) {
            System.out.print(ocen[i] + " ");
            if (ocen[i] > max) {
                max = ocen[i];
                numbermax=i+1;
            }
        }
        int min = max;
        for (int i = 0; i < ocen.length; i++) {
            if (ocen[i] < min) {
                min = ocen[i];
                numbermin=i+1;
            }
        }
        System.out.println("\nМинимальная оценка " + min+" номер в списке "+numbermin);
       System.out.println("\nМаксимаьная оценка " + max+" номер в списке "+numbermax);
    }
}
