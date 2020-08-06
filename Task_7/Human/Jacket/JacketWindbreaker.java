package Task_7.Human.Jacket;

public class JacketWindbreaker implements IJacket {

    @Override
    public void putOn() {
        System.out.println("Одел ветровку");
    }

    @Override
    public void takeOff() {
        System.out.println("Снял ветровку");

    }
}
