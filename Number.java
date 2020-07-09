public class Number {
    public static void main(String ...args){
        /*
        Создайте число. Определите, является ли число трехзначным. Определите, является
        ли его последняя цифра семеркой. Определите, является ли число четным.
         */
        double num=0;
        double b=num/100;
        System.out.println(b);
        if (b<1||b>=10){
            System.out.println("Число не трех значное");
        }else {
            System.out.println("Число трех значное");
        }
        if(num%10==7){
            System.out.println("Последняя цифра числа - 7");
        }else{
            System.out.println("Последняя цифра числа - не 7");
            if (num%2==0){
                System.out.println("Число четное");
            }else {
                System.out.println("Число не четное");
            }
        }
    }
}
