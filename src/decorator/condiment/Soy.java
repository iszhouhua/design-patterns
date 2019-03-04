package decorator.condiment;

import decorator.Beverage;
import decorator.CondimentDecorator;

/**
 * 豆浆佐料
 */
public class Soy extends CondimentDecorator {
	//需要装饰的饮料
	Beverage beverage;

	/**
	 * 实例化佐料要求使用需要装饰的饮料作为参数
	 * @param beverage 饮料
	 */
	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}

	/**
	 * 饮料描述的末尾附加佐料的描述信息
	 * @return 描述
	 */
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", 豆浆";
	}

	/**
	 * 总价等于佐料的价格加上饮料的当前价格
	 * @return 总价
	 */
	@Override
	public double cost() {
		return .15 + beverage.cost();
	}
}
