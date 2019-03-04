package observer.push;

import java.util.ArrayList;

/**
 * 气象数据（被观察者）
 */
public class WeatherData implements Subject {
    // 观察者集合
	private ArrayList<Observer> observers;
    // 温度
    private float temperature;
    // 湿度
    private float humidity;
    // 气压
    private float pressure;
	
	public WeatherData() {
		observers = new ArrayList<Observer>();
	}
	
	@Override
    public void registerObserver(Observer o) {
		observers.add(o);
	}
	
	@Override
    public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if (i >= 0) {
			observers.remove(i);
		}
	}
	
	@Override
	public void notifyObservers() {
		for (Observer observer : observers) {
		    //将所有数据推给观察者
			observer.update(temperature, humidity, pressure);
		}
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
		//通知所有观察者更新数据
		notifyObservers();
	}
}
