package singleton;

/**
 * 饿汉式单例类
 * @author ZhouHua
 * @date 2019/5/30
 */
public class EagerSingleton {
    private final static EagerSingleton INSTANCE = new EagerSingleton();

    private EagerSingleton(){}

    public static EagerSingleton getInstance(){
        return INSTANCE;
    }
}
