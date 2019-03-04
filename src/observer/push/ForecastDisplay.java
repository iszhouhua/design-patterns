package observer.push;

/**
 * 进行天气预报的布告板
 */
public class ForecastDisplay implements Observer {
    //当前气压
	private float currentPressure = 29.92f;
    //最后一次更新时的气压
	private float lastPressure;

	public ForecastDisplay(WeatherData weatherData) {
		weatherData.registerObserver(this);
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
        lastPressure = currentPressure;
		currentPressure = pressure;

		display();
	}

	public void display() {
		System.out.print("天气预报: ");
		if (currentPressure > lastPressure) {
			System.out.println("天气正在变好");
		} else if (currentPressure == lastPressure) {
			System.out.println("天气将继续保持");
		} else if (currentPressure < lastPressure) {
			System.out.println("天气转凉，注意保暖");
		}
	}
}
