public class NotEven {
    public static void main(String[] args) {
        /*7)Напишите программу, определяющую сумму всех нечетных чисел от 1до 99*/
        int sum=0;
        for(int i=0;i<100;i++){
            if(i%2!=0){
                sum=sum+i;
                System.out.println(i);
            }

        }System.out.println("Сумма чисел равна: "+sum);
    }
}
