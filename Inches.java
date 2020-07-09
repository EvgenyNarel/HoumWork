public class Inches {
    public static void main(String[] args) {
        /*
        Напишите программу печати таблицы перевода расстояний
        из дюймов всантиметры для значений длин от 1 до 20 дюймов.
        1 дюйм = 2,54 см
         */
        double inches =2.54;
        System.out.println("Дюймы \t"+"См");
        for(int i=1;i<21;i++){
            System.out.println(i+" \t\t"+ (i*inches));



        }

    }
}
