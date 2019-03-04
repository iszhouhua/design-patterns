package factory.abstraction.asus;

import factory.abstraction.Keyboard;
import factory.abstraction.Mouse;
import factory.abstraction.PeripheralFactory;

/**
 * 华硕外设工厂
 * @author ZhouHua
 * @date 2018/11/22
 */
public class AsusPeripheralFactory implements PeripheralFactory {
    @Override
    public Mouse createMouse() {
        //华硕鼠标
        return new AsusMouse();
    }

    @Override
    public Keyboard createKeyboard() {
        //华硕键盘
        return new AsusKeyboard();
    }
}
