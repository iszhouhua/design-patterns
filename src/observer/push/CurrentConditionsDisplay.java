package observer.push;

/**
 * 显示当前天气状态的布告板
 */
public class CurrentConditionsDisplay implements Observer {
    // 温度
    private float temperature;
    // 湿度
    private float humidity;

	public CurrentConditionsDisplay(Subject weatherData) {
		weatherData.registerObserver(this);
	}
	
	@Override
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		display();
	}

	public void display() {
        System.out.println("当前气象数据：温度："+temperature+"℃，湿度："+humidity+"%");
	}
}
