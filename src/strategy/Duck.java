package strategy;

/**
 * 鸭子类
 */
public class Duck {
    private QuackBehavior quackBehavior;

    /**
     * 鸭子的构造方法
     * @param qb 选择的策略
     */
    public Duck(QuackBehavior qb){
        this.quackBehavior=qb;
    }

    /**
     * 执行策略的方法
     */
    public void performQuack() {
        quackBehavior.quack();
    }

    /**
     * 替换策略的方法
     * @param qb 新策略
     */
    public void setQuackBehavior(QuackBehavior qb) {
        this.quackBehavior = qb;
    }
}
