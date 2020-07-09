import java.awt.desktop.UserSessionEvent;

public class Workout {
    public static void main(String[] args) {
        /*
        1)Начав тренировки, спортсмен в первый день пробежал 10 км.
         Каждыйдень он увеличивал дневную норму на 10% нормы предыдущего дня.
          Какойсуммарный путь пробежит спортсмен за 7 дней?
         */
        double way=10;// 10км за первый день
        double sevenDay=10;
        for(int i=0;i<6;i++){
           way=way+(way/10);
            System.out.println(way);
           sevenDay=sevenDay+way;
        }
        System.out.println("Спортсмен пробежит: "+sevenDay+" км");

    }
}
