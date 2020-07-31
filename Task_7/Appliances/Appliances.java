package Task_7.Appliances;

public abstract class Appliances {
    String name;

    Appliances(String name) {
        this.name = name;
    }

    public void turnON() {
        System.out.println(name + "вкл. в розетку");
    }
    public void turnOFF() {
        System.out.println(name + "выкл. из розетки");
    }
}
