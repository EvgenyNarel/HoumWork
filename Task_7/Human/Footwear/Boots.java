package Task_7.Human.Footwear;

public class Boots implements IFootwear {
    @Override
    public void putOn() {
        System.out.println("Обул ботинки");
    }

    @Override
    public void takeOff() {
        System.out.println("Снял ботинки");

    }
}
