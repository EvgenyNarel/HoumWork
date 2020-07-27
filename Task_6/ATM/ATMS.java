package Task_6.ATM;

import javax.print.attribute.standard.Fidelity;
import java.util.Arrays;

import static Task_6.ATM.Bill.*;

/*
Создать класс и объекты описывающие Банкомат. Набор купюр находящихся в
банкомате должен задаваться тремя свойствами: количеством купюр номиналом 20
50 100. Сделать методы для добавления денег в банкомат. Сделать функцию
снимающую деньги. На вход передается сумма денег. На выход – булевское
значение (операция удалась или нет). При снятии денег функция должна
рапечатывать каким количеством купюр какого номинала выдается сумма. Создать
конструктор с тремя параметрами – количеством купюр.
 */
public class ATMS {
    private int[] array20;
    private int[] array50;
    private int[] array100;

    ATMS(int twentyCount, int fiftyCount, int hundredCount) {
        this.array20 = new int[twentyCount];
        this.array50 = new int[fiftyCount];
        this.array100 = new int[hundredCount];

        Arrays.fill(array20, TWENTY.getValue());
        Arrays.fill(array50, FIFTY.getValue());
        Arrays.fill(array100, HUNDRED.getValue());
    }

    public void addMany(int count, Bill bill) {
        switch (bill) {
            case TWENTY:
                array20 = new int[array20.length + count];
                Arrays.fill(array20, TWENTY.getValue());
                break;
            case FIFTY:
                array50 = new int[array50.length + count];
                Arrays.fill(array50, FIFTY.getValue());
                break;
            default:
                array100 = new int[array100.length + count];
                Arrays.fill(array100, HUNDRED.getValue());
                break;
        }
    }

    boolean withdraw(int moneyValue) {
        boolean result;
        if (isOperationPossible(moneyValue)) {
            if (moneyValue >= 100) {
                moneyValue = carryOutOperation(moneyValue, HUNDRED);
            }
            if (moneyValue >= 50){
                moneyValue = carryOutOperation(moneyValue, FIFTY);
            }
            if (moneyValue >= 20){
                carryOutOperation(moneyValue, TWENTY);
            }
            result = true;
        } else {
            System.out.println("Operation is not possible!");
            result = false;
        }
        return result;
    }

    @Override
    public String toString() {
        return "ATMS{" +
                "100 - " + array100.length +
                ", 50 - " + array50.length +
                ", 20 - " + array20.length +
                "}";
    }

    private int carryOutOperation(int moneyValue, Bill bill) {
        int count = moneyValue / bill.getValue();
        int countBill = getCountBill(bill);
        if (countBill - count >= 0) {
            moneyValue -= remove(count, bill);
            System.out.println(bill.getValue() + " - " + count);
        } else {
            moneyValue -= remove(countBill, bill);
            System.out.println(bill.getValue() + " - " + countBill);
        }
        return moneyValue;
    }

    private int getCountBill(Bill bill) {
        int result;
        switch (bill) {
            case TWENTY:
                result = array20.length;
                break;
            case FIFTY:
                result = array50.length;
                break;
            default:
                result = array100.length;
        }
        return result;
    }

    private boolean isOperationPossible(int moneyValue) {
        return array20.length * TWENTY.getValue()
                + array50.length * FIFTY.getValue()
                + array100.length * HUNDRED.getValue() >= moneyValue;
    }

    private int remove(int count, Bill bill) {
        switch (bill) {
            case TWENTY:
                array20 = new int[array20.length - count];
                Arrays.fill(array20, TWENTY.getValue());
                break;
            case FIFTY:
                array50 = new int[array50.length - count];
                Arrays.fill(array50, FIFTY.getValue());
                break;
            default:
                array100 = new int[array100.length - count];
                Arrays.fill(array100, HUNDRED.getValue());
        }
        return count * bill.getValue();
    }
}
