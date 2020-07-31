package Task_5;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class LastLeter {
    public static void main(String[] args) {
        /*
        Имеется строка с текстом. Вывести текст, составленный из последних букв
        всех слов.
         */
        String stroka = "Имеется строка с текстом. Вывести текст, составленный из последних букв всех слов.";
        stroka = stroka.replaceAll("[!.,:;-]", "");
        String[] words = stroka.split(" ");
        StringBuilder newSentence = new StringBuilder();
        for (String word : words) {
            newSentence.append(word.charAt(word.length() - 1));
        }
        System.out.println(newSentence);
    }
}