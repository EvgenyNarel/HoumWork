package Task_7.Appliances;

import Task_7.Appliances.ForBath;
import Task_7.Appliances.ForCleaning;
import Task_7.Appliances.ForRelax;

/*
Создать иерархию классов, описывающих бытовую технику. Создать несколько
объектов описанных классов, часть из них включить в розетку.
 */
public class Runner {
    public static void main(String... args) {
//        ForBath washer = new ForBath();
//        washer.plugging(true);
//        ForRelax tv = new ForRelax();
//        tv.plugging(false);
//        ForCleaning vacuumCleaner = new ForCleaning();
//        vacuumCleaner.plugging(true);
        ForBath washer = new ForBath("washer");
        Supporting b = new Supporting("multicooker");
        b.turnON();
        washer.turnOFF();
    }
}
