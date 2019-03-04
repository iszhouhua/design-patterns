package factory.abstraction;

/**
 * 电脑外设工厂接口
 * @author ZhouHua
 * @date 2018/11/22
 */
public interface PeripheralFactory {
    /**
     * 生产鼠标的方法
     * @return 鼠标
     */
    public Mouse createMouse();
    /**
     * 生产键盘的方法
     * @return 键盘
     */
    public Keyboard createKeyboard();
}
