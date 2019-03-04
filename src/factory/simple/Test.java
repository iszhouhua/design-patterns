package factory.simple;

public class Test {
    public static void main(String[] args) {
        //实例化CPU工厂
        CpuFactory cpuFactory=new CpuFactory();
        //生产Intel的CPU
        Cpu intelCpu=cpuFactory.createCpu(true);
        System.out.println(intelCpu.getCpu());
        //生产AMD的CPU
        Cpu amdCpu=cpuFactory.createCpu(false);
        System.out.println(amdCpu.getCpu());
    }
}
