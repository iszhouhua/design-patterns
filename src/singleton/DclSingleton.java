package singleton;

/**
 * 双重校验锁单例类
 * @author ZhouHua
 * @date 2019/5/30
 */
public class DclSingleton {
    private static volatile DclSingleton INSTANCE;

    private DclSingleton(){}

    public static DclSingleton getInstance(){
        if (INSTANCE == null) {
            synchronized (DclSingleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new DclSingleton();
                }
            }
        }
        return INSTANCE;
    }
}
