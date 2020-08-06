package Task_7.Human.Pants;

import Task_7.Human.Footwear.IFootwear;

public class Shorts implements IPants {
    @Override
    public void putOn() {
        System.out.println("Одел шорты");

    }

    @Override
    public void takeOff() {
        System.out.println("Снял шорты");

    }
}
