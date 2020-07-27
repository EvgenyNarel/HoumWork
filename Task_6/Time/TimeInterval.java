package Task_6.Time;
 /*
        Создать класс и объекты описывающие промежуток времени. Сам промежуток
        в классе должен задаваться тремя свойствами: секундами, минутами, часами.
        Сделать методы для получения полного количества секунд в объекте, сравнения
        двух объектов (метод должен работать аналогично compareTo в строках). Создать
        два конструктора: получающий общее количество секунд, и часы, минуты и секунды
        по отдельности. Сделать метод для вывода данных.
         */
public  class TimeInterval {
    int hours=0;
    int minutes=0;
    int seconds=3;
    TimeInterval(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;

    }
        int fullsecond (){
            return (hours*3600) + (minutes*60)  + seconds;
        }

        TimeInterval(int fullseconds){
        this.fullsecond();

        }

      public int Sravnenie(TimeInterval obj){
        return fullsecond()> obj.fullsecond() ? 1 : fullsecond() == obj.fullsecond() ? 0 : -1;


  }
}