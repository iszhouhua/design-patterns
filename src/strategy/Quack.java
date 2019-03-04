package strategy;

/**
 * 嘎嘎叫的策略
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("嘎嘎叫");
    }
}
