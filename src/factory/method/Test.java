package factory.method;

import factory.method.factory.AmdGpuFactory;
import factory.method.factory.NvidiaGpuFactory;

/**
 * @author ZhouHua
 * @date 2018/11/22
 */
public class Test {
    public static void main(String[] args) {
        //实例化NVIDIA显卡工厂
        GpuFactory nvidiaGpuFactory=new NvidiaGpuFactory();
        //生产NVIDIA的显卡
        Gpu nvidiaGpu=nvidiaGpuFactory.createGpu();
        System.out.println(nvidiaGpu.getGpu());
        //实例化AMD显卡工厂
        GpuFactory amdGpuFactory=new AmdGpuFactory();
        //生产AMD的显卡
        Gpu amdGpu=amdGpuFactory.createGpu();
        System.out.println(amdGpu.getGpu());
    }
}
