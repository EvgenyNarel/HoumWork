package Task_7.Robot.legs;

public class SonyLeg implements ILeg {
    private int price;

    public SonyLeg(int price) {
        this.price = price;
    }

    public SonyLeg() {

    }

    @Override
    public void step() {
        System.out.println("Самые быстрые ноги от Sony");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
