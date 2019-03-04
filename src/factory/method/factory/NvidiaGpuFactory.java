package factory.method.factory;

import factory.method.Gpu;
import factory.method.GpuFactory;
import factory.method.gpu.NvidiaGpu;

/**
 * NVIDIA显卡工厂
 */
public class NvidiaGpuFactory implements GpuFactory {
    @Override
    public Gpu createGpu() {
        //生产NVIDIA的显卡
        return new NvidiaGpu();
    }
}
