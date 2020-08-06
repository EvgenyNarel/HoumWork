package Task_7.Robot.hands;

public class SonyHand implements IHand{
    private int price;

    public SonyHand(int price){
        this.price=price;
    }
    public SonyHand(){

    }

    @Override
    public void upHand() {
        System.out.println("Лучшие руки от Sony");

    }

    @Override
    public int getPrice() {
        return price;
    }
}
