package Task_7.Robot;


import Task_7.Robot.hands.SamsungHand;
import Task_7.Robot.heads.ToshibaHead;
import Task_7.Robot.legs.SonyLeg;

/*     Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
 */
public class Run {


    public void cost(Robot robot, Robot robot2, Robot robot3) {
        if (robot.getPrice() > robot2.getPrice() && robot.getPrice() > robot3.getPrice()) {
            System.out.println(robot.getName() + " Самый дорогой робот");
        } else if (robot2.getPrice() > robot3.getPrice() && robot.getPrice() > robot.getPrice()) {
            System.out.println(robot2.getName() + " Самый дорогой робот");
        } else {
            System.out.println(robot3.getName() + " Самый дорогой робот");
        }

    }

    public static void main(String[] args) {

        Robot robokop = new Robot(new ToshibaHead(15), new SamsungHand(15), new SonyLeg(10), "robokop");
        robokop.action();
        System.out.println(robokop.getPrice());

        Robot terminator = new Robot(new ToshibaHead(10), new SamsungHand(10), new SonyLeg(10), "terminator");
        terminator.action();
        System.out.println(terminator.getPrice());

        Robot transformer = new Robot(new ToshibaHead(5), new SamsungHand(5), new SonyLeg(5), "transformer");
        transformer.action();
        System.out.println(transformer.getPrice());

        Run run = new Run();
        run.cost(robokop, terminator, transformer);


    }
}
