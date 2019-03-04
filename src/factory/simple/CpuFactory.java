package factory.simple;

import factory.simple.cpu.AmdCpu;
import factory.simple.cpu.IntelCpu;

/**
 * CPU工厂
 */
public class CpuFactory {
    /**
     * 根据参数决定要生产的是Intel的CPU还是AMD的CPU
     * @param isIntelCpu 是否生产Intel的CPU
     * @return 生产的CPU
     */
    public Cpu createCpu(boolean isIntelCpu){
        if(isIntelCpu){
            //生产Intel的CPU
            return new IntelCpu();
        }else{
            //生产AMD的CPU
            return new AmdCpu();
        }
    }
}
