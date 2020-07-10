

public class SluchChesla {
    public static void main(String[] args) {
        /*
        Создать последовательность случайных чисел,
        найти и вывести наибольшее из них.
         */

        int a[]=new int [10];
        int max=a[0];


        for (int i=0;i<a.length;i++){
            a[i]= (int) (Math.random()*20);
           System.out.print(" "+a[i]+" ");
            if(a[i]>max){
                max=a[i];

            }
        }
        System.out.println("\n Максимальное число из массива: "+max);
    }
}
