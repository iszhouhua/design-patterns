package factory.abstraction.lenovo;

import factory.abstraction.Keyboard;
import factory.abstraction.Mouse;
import factory.abstraction.PeripheralFactory;

/**
 * 联想外设工厂
 * @author ZhouHua
 * @date 2018/11/22
 */
public class LenovoPeripheralFactory implements PeripheralFactory {
    @Override
    public Mouse createMouse() {
        //联想鼠标
        return new LenovoMouse();
    }

    @Override
    public Keyboard createKeyboard() {
        //联想键盘
        return new LenovoKeyboard();
    }
}
