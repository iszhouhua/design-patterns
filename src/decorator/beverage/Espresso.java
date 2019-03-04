package decorator.beverage;

import decorator.Beverage;

/**
 * 浓缩咖啡
 */
public class Espresso extends Beverage {
	public Espresso() {
		description = "浓缩咖啡";
	}

	@Override
	public double cost() {
		return 1.99;
	}
}

