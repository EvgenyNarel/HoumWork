package Task_5;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Punctuation {
    public static void main(String... args) {
         /*
    Найти в строке не только запятые, но и другие знаки препинания. Подсчитать
общее их количество.
     */
        String stroka = "Строковый литерал - это послед,овательность?символов,заключенных в двойные кавычки.";
        int counter =0;
        Pattern p = Pattern.compile("\\p{Punct}");
        Matcher m = p.matcher(stroka);
        while (m.find()) {
          counter++;
        }
        System.out.println("Количество знаков припенания: "+counter);

    }
}