package Task_7.Human;

import Task_7.Human.Footwear.Boots;
import Task_7.Human.Jacket.JacketWindbreaker;
import Task_7.Human.Jacket.LeatherJacket;
import Task_7.Human.Pants.Jeans;

public class Runner {


    public static void main(String[] args) {
        Human n =new Human("Коля", new JacketWindbreaker(),new Jeans(),new Boots());
//        n.getDressed();

        n.undress();
    }
}
