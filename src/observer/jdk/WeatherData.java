package observer.jdk;

import java.util.Observable;

/**
 * 气象数据（被观察者）
 */
public class WeatherData extends Observable {
    // 温度
    private float temperature;
    // 湿度
    private float humidity;
    // 气压
    private float pressure;

    public WeatherData() { }

    /**
     * 从气象站得到更新观测值时，通知观察者
     */
    public void measurementsChanged() {
        //标记状态为已改变
        setChanged();
        //通知观察者更新数据。如果没有标记状态为已改变，则不会发送通知
        notifyObservers(pressure);
    }

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
        measurementsChanged();
    }

    /**
     * 拉取温度
     * @return
     */
    public float getTemperature() {
        return temperature;
    }

    /**
     * 拉取湿度
     * @return
     */
    public float getHumidity() {
        return humidity;
    }
}