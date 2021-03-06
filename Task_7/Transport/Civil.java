package Task_7.Transport;

/*
В классе Гражданский добавляются поля:
 - Кол-во пассажиров
 - Наличие бизнес класса (true/false)
 Делаем метод как для грузовых машин только для Гражданских  самолётов и проверяем вместимость пассажиров.

 */
public class Civil extends AirTransport {
    int passengers;
    boolean businessClass;
    Civil(int p){
        this.passengers=p;
    }

    public void specifications(int passengers, boolean businessClass, double power) {
        this.passengers = passengers;
        this.businessClass = businessClass;
        if (businessClass == true) {
            System.out.println("Колличество пассажиров: " + passengers + ", Наличие бизнес класса: " + " Есть" + ", Мощность в кВ: " + powerkW(power));
        } else {
            System.out.println("Колличество пассажиров: " + passengers + ", Наличие бизнес класса: " + " Нет," + " Мощность в кВ: " + powerkW(power));
        }
    }
    public void numberOfPassengers(int peopl) {
        if (peopl <= passengers) {
            System.out.println("Самолет заполнен");
        } else {
            System.out.println("Вам нужен самолет побольше");
        }
    }

}