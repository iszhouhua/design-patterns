package factory.simple.cpu;

import factory.simple.Cpu;

/**
 * Intel的CPU
 */
public class IntelCpu implements Cpu {
    @Override
    public String getCpu() {
        return "Intel的CPU";
    }
}
