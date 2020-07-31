package Task_7.Human.Footwear;

public class Sneakers implements IFootwear {
    @Override
    public void putOn() {
        System.out.println("Обул кеды");
    }

    @Override
    public void takeOff() {
        System.out.println("Снял кеды");

    }
}
