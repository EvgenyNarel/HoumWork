import org.w3c.dom.ls.LSOutput;

public class Hole {
    public static void main(String...args) {
        /*
        Имеется прямоугольное отверстие размерами a и b, определить, можно ли его
        полностью закрыть круглой картонкой радиусом r.
         */
        double stora = 8;
        double storb = 4;
        double radius = 0;
        double diametr=radius*2;
        if ((stora <= 0) || (storb <= 0) || (radius <= 0)) {
            System.out.println(" Введите положительные числа!");
            } else {
// расчитываю гипотенузу прямоугольнника, если он равна диаметру или меньше диаметра кортонки то отверстие можно закрыть
            double storc = (stora*stora) + (storb * storb);
            double gipotenuza = (double) Math.sqrt(storc);
            System.out.println(gipotenuza);
            System.out.println(diametr);

            if (diametr >= gipotenuza) {
                System.out.println("Картонка закрывает отверстие");
            } else {
                System.out.println("Картонка не закрывает отверстие");
            }
        }
    }
}
