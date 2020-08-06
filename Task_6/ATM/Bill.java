package Task_6.ATM;

public enum Bill {
    TWENTY(20),
    FIFTY(50),
    HUNDRED(100);

    private int value;

    Bill(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
