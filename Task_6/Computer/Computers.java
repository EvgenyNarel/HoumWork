package Task_6.Computer;

import java.util.Random;
import java.util.Scanner;

/*
Создать класс компьютер.
Поля:
- процессор
- оперативка
- жесткий диск
- ресурс полных циклов работы (включений/выключений)

Методы:
- метод описание(вывод всех полей)
- метод включить, при включении может произойти сбой, при вызове метода рандом загадывает число (0 либо 1), вы вводите число с клавиатуры, если угадали комп включается, если нет сгорает. Если комп сгорел, при попытке включить нужно выдать сообщение что ему конец
- выключить (аналогично включению)
- при превышении лимита ресурса комп сгорает

 */
public class Computers {
    String cpu = "Intel i7";
    int ram = 2000;
    int hdd = 1000;
    int resource = 2;
    int sum = 0;
    int count = 0;
    boolean work = true;

    public void allFields() {
        System.out.println("CPU: " + cpu + "\n" + "RAM: " + ram + "\n" + "HDD: " + hdd + "\n" + "resource of full cycles of work (on / off): " + resource + "\n");
    }

    public void turnOn() {
        if (sum > (resource * 3)) {
            System.out.println("Комп сгорел");
            return;
        }
        if (work == false) {
            System.out.println("Компьютеру конец");
            return;
        }
        int x = (int) (Math.random() * 2);
        System.out.println(x);

        System.out.println("Чтобы включить компьютер, введите число 0 или 1: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number > 1 || number < 0) {
            System.out.println("Вы ввели неверное число");
            System.out.println("Введите число 0 или 1: ");
            scanner.nextInt();
        }
        if (x == number) {
            System.out.println("Компьютер включен");
            work = true;
            count++;
            sum += count;
        } else {
            System.out.println("Компьютер сгорел");
        }
    }

    public void turnOff() {
        if (sum > (resource * 3)) {
            System.out.println("Комп сгорел, конец ресурсу");
            return;
        }
        if (work == true) {
            int x = (int) (Math.random() * 1);
            System.out.println(x);

            System.out.println("Чтобы выключить компьютер, введите число 0 или 1: ");
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            if (number > 1 || number < 0) {
                System.out.println("Вы ввели неверное число");
                System.out.println("Введите число 0 или 1: ");
                scanner.nextInt();
            }
            if (x == number) {
                System.out.println("Компьютер выкючен");
                int con = 0;
                con++;
                sum += con;
            } else {
                System.out.println("Компьютер сгорел");
                work = false;
            }
        } else {
            System.out.println("Комп можно не выключать");
            work = false;
        }

    }

}
