package singleton;

/**
 * 懒汉式单例类（线程不安全）
 * @author ZhouHua
 * @date 2019/5/30
 */
public class UnsafeLazySingleton {

    private static UnsafeLazySingleton INSTANCE;

    private UnsafeLazySingleton() {}

    public static UnsafeLazySingleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new UnsafeLazySingleton();
        }
        return INSTANCE;
    }
}
