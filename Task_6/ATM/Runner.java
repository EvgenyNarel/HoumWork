package Task_6.ATM;

public class Runner {
    public static void main(String[] args) {
        ATMS c = new ATMS(1, 2, 1);
        System.out.println(c);

        c.addMany(1, Bill.HUNDRED);
        System.out.println(c);

        c.addMany(1, Bill.FIFTY);
        System.out.println(c);

        c.addMany(1, Bill.TWENTY);
        System.out.println(c);

        System.out.println(c.withdraw(270));
        System.out.println(c);

        System.out.println(c.withdraw(1000));
        System.out.println(c);
    }
}