package Task_5;

import java.util.Arrays;

public class PunctuationMarks {
    public static void main(String... args) {
         /*
    Найти в строке не только запятые, но и другие знаки препинания. Подсчитать
общее их количество.
     */
        String stroka = "Строковый литерал — это послед,овательность?символов,заключенных в двойные кавычки.";
        char marks[] = new char[]{'"', '!', '\'', '"', '#', ',', '$', '%', '&', '(', ')', '*', '+', '-', '.', '/', ':', ';', '<', '=', '>', '?', '@', '[', '\\', ']', '^', '_', '`', '{', '|', '}', '~', '—'};
        int counter = 0;
        char symbol;
        for (int i = 0; i < stroka.length(); i++) {
            symbol = stroka.charAt(i);
            for (int j = 0; j < marks.length; j++) {
                if (symbol == marks[j]) {
                    counter++;
                    break;
                }
            }

        }
        System.out.println(counter);
    }


}
