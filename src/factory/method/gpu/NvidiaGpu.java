package factory.method.gpu;

import factory.method.Gpu;

/**
 * NVIDIA的显卡
 */
public class NvidiaGpu implements Gpu {
    @Override
    public String getGpu() {
        return "NVIDIA的显卡";
    }
}
