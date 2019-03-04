package observer.pull;

/**
 * 观察者接口
 */
public interface Observer {
	/**
	 * 当气象观测值改变时，将主题自身的引用，传递给观察者，观察者按需取出数据
	 * @param subject 被观察者
	 */
	public void update(Subject subject);
}
