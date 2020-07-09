public class ThreeNumber {
    public static void main(String[] args) {
        /*Найдите сумму первых n целых чисел, которые делятся на 3.
         */
        int a=3;
        int b=0;
        int c=0;
        for(int i=1;i<11;i++){
            c=i%3;

            if(c==0){
                b=b+i;

                }

            }
        System.out.println(b);

            }


        }



