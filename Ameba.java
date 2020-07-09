public class Ameba {
    public static void main(String[] args) {
        /*
        2)Одноклеточная амеба каждые 3 часа делится на 2 клетки.
         Определить,сколько амеб будет через 3, 6, 9, 12,..., 24 часа.
         */
        int ameb=1;
        int d=0;
        for (int i=3;i<25;i++){
            if (i%3==0) {
                ameb = ameb * 2;
                System.out.println(" Через "+i+" часа(ов) амеб будет "+ameb+ " шт.");
            }
                d=d+ameb;

        }



    }
}
