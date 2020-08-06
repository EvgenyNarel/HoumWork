package Task_5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TegMy {
    public static void main(String[] args) {
        /*
        Написать программу, выполняющую поиск в строке всех тегов абзацев, в т.ч. тех, у
        которых есть параметры, например <p id=”p1”>, и замену их на простые теги
        абзацев <p>.
         */
        String str = "<p id=p1> sef<p id=p1> kkkk  khg gkhjg";
        System.out.println(str.replaceAll("<p id=p1>", "<p>"));
    }

}



