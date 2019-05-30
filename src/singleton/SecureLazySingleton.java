package singleton;

/**
 * 懒汉式单例类（线程安全）
 * @author ZhouHua
 * @date 2019/5/30
 */
public class SecureLazySingleton {

    private static SecureLazySingleton INSTANCE;

    private SecureLazySingleton() {}

    public static synchronized SecureLazySingleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new SecureLazySingleton();
        }
        return INSTANCE;
    }
}
