package observer.jdk;

import java.util.Observable;
import java.util.Observer;

/**
 * 进行天气预报的布告板
 */
public class ForecastDisplay implements Observer {
    //当前气压
    private float currentPressure = 29.92f;
    //最后一次更新时的气压
    private float lastPressure;

    public ForecastDisplay(Observable observable) {
        observable.addObserver(this);
    }

    /**
     * 采用推方法更新气压
     * @param observable 被观察的对象
     * @param arg 传递给 notifyObservers方法的参数（气压）
     */
    @Override
    public void update(Observable observable, Object arg) {
        lastPressure = currentPressure;
        currentPressure = (float)arg;
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
