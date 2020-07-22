package Task_5;

public class ThreeLins {
    public static void main(String[] args) {
        /*
        Напишите три цикла выполняющих многократное сложение строк, один с
          помощью оператора сложения и String, другой с помощью StringBuilder и метода
        append, а также аналогино для StringBuffer. Сравните скорость их выполнения.
         */
        long start = System.currentTimeMillis();
        String line = "Number";
        int i = 0;
        while (i < 100000) {
            line += i;
            i++;
        }
        System.out.println(line);
        long finish = System.currentTimeMillis();
        System.out.println("Время выполнения: " + (start - finish));

        long start2 = System.currentTimeMillis();
        int j = 0;
        StringBuilder a = new StringBuilder("Number");
        while (j < 100000) {
            a.append(j);
            j++;
        }
        System.out.println(a.toString());
        long finish2 = System.currentTimeMillis();
        System.out.println("Время выполнения: " + (start2 - finish2) + " миллисекунд");

        long start3 = System.currentTimeMillis();
        int y = 0;
        StringBuffer b = new StringBuffer("Number");
        while (y < 100000) {
            a.append(y);
            y++;
        }
        System.out.println(b.toString());
        long finish3 = System.currentTimeMillis();
        System.out.println("Время выполнения: " + (start3 - finish3) + " миллисекунд");

    }
}
