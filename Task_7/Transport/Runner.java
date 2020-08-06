package Task_7.Transport;



public class Runner {
    public static void main(String[] args) {
        Military m = new Military(2,true);
        m.catapult();
        m.shot();
        LightTransport s=new LightTransport("Пикап",6,10);
        s.specifications();


    }
}
