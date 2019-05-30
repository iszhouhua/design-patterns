package singleton;

/**
 * 登记式/静态内部类 单例类
 * @author ZhouHua
 * @date 2019/5/30
 */
public class StaticInnerSingleton {

    private StaticInnerSingleton(){}

    private static class SingletonInstance {
        private static final StaticInnerSingleton INSTANCE = new StaticInnerSingleton();
    }

    public static StaticInnerSingleton getInstance() {
        return SingletonInstance.INSTANCE;
    }
}
