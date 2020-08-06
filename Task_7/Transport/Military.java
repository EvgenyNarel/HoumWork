package Task_7.Transport;

/*
В классе Военный  добавляются поля:
- Наличие системы катапультирования (true/false) - Кол-во ракет на борту
-Для Военных самолётов делаем метод выстрел, проверяем если кол-во ракет не равно 0 то выводим на консоль “ Ракета пошла…”, если 0 то
“Боеприпасы отсутствуют”.
А так же метод катапультирование, который проверит если наличие системы катапультирования true,
 то выводим “Катапультирование прошло успешно”, если false, то “У вас нет такой системы ”

 */
public class Military extends AirTransport {
    int missiles;
    boolean ejection;

    Military(int m, boolean e) {
        this.missiles = m;
        this.ejection = e;
    }

    public void specifications(boolean ejection, int missiles, double power) {
        this.ejection = ejection;
        this.missiles = missiles;
        if (ejection == true) {
            System.out.println("Наличие системы катапультирования: Есть" + ", Колличество ракет на борту: " + missiles + ", Мощность в кВ: " + powerkW(power));
        } else {
            System.out.println("Наличие системы катапультирования: Нет" + ", Колличество ракет на борту: " + missiles + ", Мощность в кВ: " + powerkW(power));
        }
    }

    public void shot() {
        if (missiles != 0) {
            System.out.println("Ракета пошла");
        } else if (missiles == 0) {
            System.out.println("Боеприпасы отсутствуют");
        }
    }

    public void catapult(){
        if(ejection==true){
            System.out.println("Катапультирование прошло успешно");
        }else {
            System.out.println("У вас нет такой системы ");
        }
    }


}
