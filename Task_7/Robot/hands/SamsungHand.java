package Task_7.Robot.hands;

public class SamsungHand  implements IHand{
        private int price;

        public SamsungHand(int price){
            this.price=price;
        }
        public SamsungHand(){

        }

        @Override
        public void upHand() {
            System.out.println("Лучшие руки от Samsung");

        }

        @Override
        public int getPrice() {
            return price;
        }
    }

