import org.w3c.dom.ls.LSOutput;

public class Hole {
    public static void main(String...args) {
        /*
        Имеется прямоугольное отверстие размерами a и b, определить, можно ли его
        полностью закрыть круглой картонкой радиусом r.
         */
        double a = 8;
        double b = 4;
        double a1 = a / 2;
        double b1 = b / 2;
        double r = 5;
        if ((a <= 0) || (b <= 0) || (r <= 0)) {
            System.out.println(" Введите положительные числа!");
        } else {

            double stor = (a1 * a1) + (b1 * b1);     //нашел половину диагонали прямоугольника,
            double resalt = (double) Math.sqrt(stor);//которая равна радиусу окружности
            System.out.println(resalt);

            if (r >= resalt) {
                System.out.println("Картонка закрывает отверстие");
            } else {
                System.out.println("Картонка не закрывает отверстие");
            }
        }
    }
}
