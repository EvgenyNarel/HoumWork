import java.util.Random;

public class Rubly {
    public static void main(String ... args){
        /*
        Имеется целое число (задать с помощью Random rand = new Random(); int x =
        rand.nextInt() ). Это число – количесво денег в рублях. Вывести это число, добавив к
        нему слово «рублей» в правильном падеже.
         */
        Random rand=new Random();
        int x=rand.nextInt(300);
       // System.out.println(x);
        int a=x%10;
        switch(a){
            case 1:
                System.out.println(x+" рубль");
                break;
            case 2:
            case 3:
            case 4:
            System.out.println(x+" рубля");
            break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 0:
                System.out.println(x+" рублей");
                break;

        }
    }
}
