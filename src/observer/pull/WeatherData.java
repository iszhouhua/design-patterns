package observer.pull;

/**
 * 气象数据（被观察者）
 */
public class WeatherData extends Subject {
    // 温度
    private float temperature;
    // 湿度
    private float humidity;
    // 气压
    private float pressure;

    /**
     * 更新观测值
     * @param temperature 温度
     * @param humidity 湿度
     * @param pressure 气压
     */
	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
        //通知所有观察者更新数据
        notifyObservers();
	}

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
