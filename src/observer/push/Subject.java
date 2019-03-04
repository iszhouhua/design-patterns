package observer.push;

/**
 * 被观察者接口
 */
public interface Subject {
    /**
     * 注册观察者
     * @param o 需要注册的观察者对象
     */
    public void registerObserver(Observer o);

    /**
     * 删除观察者
     * @param o 需要删除的观察者对象
     */
    public void removeObserver(Observer o);

    /**
     * 通知所有观察者
     */
    public void notifyObservers();
}
