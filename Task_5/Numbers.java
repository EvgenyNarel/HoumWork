
    package Task_5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

    public class Numbers {
        public static void main(String[] args) {
        /*

        Написать программу, выполняющую поиск в строке шестнадцатеричных чисел,
        записаных по правилам Java, с помощью регулярных выражений и вывести их на
        страницу.  от 0x0000000000000000 до 0xFFFFFFFFFFFFFFFF.
         */
            String str = " 0x00002300 kkk 0447 x22530 khg 0xFFFFFFFFFFFFFFF gkhjg";//
            Pattern p = Pattern.compile("0x[A-Fa-f0-9]{1,16}");
            Matcher m = p.matcher(str);
            while (m.find()) {
                System.out.println(str.substring(m.start(), m.end()));
            }

        }

    }

