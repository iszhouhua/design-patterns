package factory.simple.cpu;

import factory.simple.Cpu;

/**
 * AMD的CPU
 */
public class AmdCpu implements Cpu {
    @Override
    public String getCpu() {
        return "AMD的CPU";
    }
}
