package decorator;

/**
 * 佐料抽象类
 */
public abstract class CondimentDecorator extends Beverage {
    /**
     * 获得描述，佐料的子类必须重写描述信息
     * @return 描述
     */
	@Override
    public abstract String getDescription();
}
