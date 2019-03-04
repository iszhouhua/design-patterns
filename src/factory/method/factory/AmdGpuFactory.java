package factory.method.factory;

import factory.method.Gpu;
import factory.method.GpuFactory;
import factory.method.gpu.AmdGpu;

/**
 * AMD显卡工厂
 */
public class AmdGpuFactory implements GpuFactory {
    @Override
    public Gpu createGpu() {
        //生产AMD的显卡
        return new AmdGpu();
    }
}
