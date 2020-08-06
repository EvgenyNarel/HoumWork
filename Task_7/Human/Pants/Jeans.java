package Task_7.Human.Pants;

import Task_7.Human.Footwear.IFootwear;

public class Jeans implements IPants {
    @Override
    public void putOn() {
        System.out.println("Одел джинсы");

    }

    @Override
    public void takeOff() {
        System.out.println("Снял джинсы");

    }
}
