package factory.method;

/**
 * 显卡工厂接口
 */
public interface GpuFactory {
    /**
     * 生产显卡的方法
     * @return 显卡
     */
    public Gpu createGpu();
}
