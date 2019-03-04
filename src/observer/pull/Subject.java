package observer.pull;

import java.util.ArrayList;
import java.util.List;

/**
 * 被观察者接口
 */
public class Subject {
    /**
     * 观察者集合
     */
    private List<Observer> observers=new ArrayList<>();
    /**
     * 注册观察者
     * @param o 需要注册的观察者对象
     */
    public void registerObserver(Observer o){
        if (o!=null&&!observers.contains(o)) {
            observers.add(o);
        }
    }

    /**
     * 删除观察者
     * @param o 需要删除的观察者对象
     */
    public void removeObserver(Observer o){
        observers.remove(o);
    }

    /**
     * 通知所有观察者
     */
    public void notifyObservers(){
        for (Observer observer : observers) {
            //将所有数据推给观察者
            observer.update(this);
        }
    }
}
