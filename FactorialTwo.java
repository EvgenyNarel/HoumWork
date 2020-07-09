public class FactorialTwo {
    public static void main(String ...args){
        /*
        Посчитать факториал числа в границах от 10 до 15 (не используя рекурсию).
         */
        int sum=1;
        int nut= (int) (10+Math.random()*6);
        System.out.println(nut);
        for (int i = 1; i <=nut; i++) {
                sum =sum*i;
            }

        System.out.println("Факториал числа " + nut + " равен " + sum);

    }

}
