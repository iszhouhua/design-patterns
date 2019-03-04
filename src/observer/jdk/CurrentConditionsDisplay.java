package observer.jdk;

import java.util.Observable;
import java.util.Observer;

/**
 * 显示当前天气状态的布告板
 */
public class CurrentConditionsDisplay implements Observer {
    // 被观察者
    Observable observable;
    // 温度
    private float temperature;
    // 湿度
    private float humidity;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    /**
     * 采用拉方法更新数据，每个布告板只获取自己所需要的信息
     * @param obs 被观察的对象
     * @param arg 传递给 notifyObservers方法的参数
     */
    @Override
    public void update(Observable obs, Object arg) {
        if (obs instanceof WeatherData) {
            WeatherData weatherData = (WeatherData)obs;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            System.out.println("当前气象数据：温度："+temperature+"℃，湿度："+humidity+"%");
        }
    }
}
