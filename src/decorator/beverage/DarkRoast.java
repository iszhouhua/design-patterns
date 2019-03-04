package decorator.beverage;

import decorator.Beverage;

/**
 * 深焙咖啡
 */
public class DarkRoast extends Beverage {
	public DarkRoast() {
		description = "深焙咖啡";
	}

	@Override
	public double cost() {
		return .99;
	}
}

