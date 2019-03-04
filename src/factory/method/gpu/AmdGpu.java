package factory.method.gpu;

import factory.method.Gpu;

/**
 * AMD的显卡
 */
public class AmdGpu implements Gpu {
    @Override
    public String getGpu() {
        return "AMD的显卡";
    }
}
