package decorator;

/**
 * 饮料抽象类
 */
public abstract class Beverage {
    //饮料描述
	protected String description = "未知饮料";

    /**
     * 获得描述
     * @return 描述
     */
	public String getDescription() {
		return description;
	}

    /**
     * 计算价格的方法，所有子类必须实现此方法
     * @return 价格
     */
	public abstract double cost();
}
