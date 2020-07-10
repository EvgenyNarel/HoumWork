public class TurnOver {
    public static void main(String... args) {
        /*Создать массив, заполнить его случайными элементами, распечатать,
        перевернуть, и снова распечатать (при переворачивании нежелательно создавать
        еще один массив).*/
        int array[] = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
            System.out.print(array[i]);
        }
        System.out.println(" ");
        int n = array.length;
        int temp;
        for (int i = 0; i < n / 2; i++) {
            temp = array[n - i - 1];
            array[n - i - 1] = array[i];
            array[i] = temp;

        }
        //Выводим конечный массив в консоль
        for (int i=0; i<array.length; i++){
            System.out.print(array[i]);
            }

        }
    }



