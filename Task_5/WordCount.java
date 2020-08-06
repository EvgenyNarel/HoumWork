package Task_5;

import java.util.Arrays;

public class WordCount {
        public static void main(String... args) {
        /*
        Имеется строка с текстом. Подсчитать     количество слов в тексте. Желательно
        учесть, что слова могут разделяться    несколькими пробелами, в начале и конце
        текста также могут быть пробелы, но могут и отсутствовать.
         */

            String stroka = "    Имеется строка с     текстом. Подсчитать количество слов в тексте.   ";
            String withoutprobel = stroka.trim();
            String a = Arrays.toString(withoutprobel.split(" +"));
            int counter = 1;
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) == ' ') {
                    counter++;
                }
            }
            System.out.println("Текст состит из: "+counter+" слов");

        }
    }


