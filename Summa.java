public class Summa {
    public static void main(String[] args) {
        /*
        3)Вычислить: 1+2+4+8+...+256.
         */
        int a=1;
        int b=0;
        while(a<=256){
            a*= 2;
            b = +a-1;
        }
        System.out.println("Сумма чисел равна: " +b);
    }
}
