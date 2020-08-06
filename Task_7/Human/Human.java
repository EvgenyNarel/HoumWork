package Task_7.Human;
/*
2) По аналогии с первым задание делаем след. задание.
Интерфейсы:
- Куртка
- Штаны
- Обувь
в каждом интерфейсе есть 2 метода (надеть и снять)
Делаем несколько реализации каждого интерфейса.
Создаём класс человек:
У человека поля:
-имя
-куртка
-штаны
-обувь
У человека есть 2 метода:
- одеться(вызываются методы надеть у всех вещей)
- раздеться (вызываются методы снять у всех вещей)

 */

import Task_7.Human.Footwear.IFootwear;
import Task_7.Human.Jacket.IJacket;
import Task_7.Human.Pants.IPants;

public class Human {
    private String name;
    private IJacket jacket;
    private IPants pants;
    private IFootwear footwear;

    public Human(String name, IJacket jacket, IPants pants,IFootwear footwear) {
        this.name = name;
        this.footwear = footwear;
        this.jacket = jacket;
        this.pants = pants;
    }
    public Human(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public IJacket getJacket() {
        return jacket;
    }

    public void setJacket(IJacket jacket) {
        this.jacket = jacket;
    }

    public IPants getPants() {
        return pants;
    }

    public void setPants(IPants pants) {
        this.pants = pants;
    }

    public IFootwear getFootwear() {
        return footwear;
    }

    public void setFootwear(IFootwear footwear) {
        this.footwear = footwear;
    }

    public void getDressed(){
    footwear.putOn();
    pants.putOn();
    jacket.putOn();
        System.out.println(name+" оделся");
    }
    public void undress(){
        footwear.takeOff();
        pants.takeOff();
        jacket.takeOff();
        System.out.println(name+ " разделся");

    }
}
