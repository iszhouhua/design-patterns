package decorator;

import decorator.beverage.DarkRoast;
import decorator.beverage.Espresso;
import decorator.condiment.Mocha;
import decorator.condiment.Soy;
import decorator.condiment.Whip;

public class Test {
    public static void main(String args[]) {
        //购买一杯浓缩咖啡，不需要佐料
        Beverage beverage = new Espresso();
        //加入豆浆
        beverage = new Soy(beverage);
        System.out.println(beverage.getDescription()
                + " $" + beverage.cost());

        //购买一杯深焙咖啡
        Beverage beverage2 = new DarkRoast();
        //添加摩卡
        beverage2 = new Mocha(beverage2);
        //再添加一份摩卡
        beverage2 = new Mocha(beverage2);
        //最后加上奶泡
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription()
                + " $" + beverage2.cost());
    }
}
