package Task_7.Human.Jacket;


public class LeatherJacket implements IJacket {
    @Override
    public void putOn() {
        System.out.println("Одел косуху");
    }

    @Override
    public void takeOff() {
        System.out.println("Снял косуху");

    }
}
