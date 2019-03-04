package factory.abstraction;

import factory.abstraction.asus.AsusPeripheralFactory;
import factory.abstraction.lenovo.LenovoPeripheralFactory;

/**
 * @author ZhouHua
 * @date 2018/11/22
 */
public class Test {
    public static void main(String[] args) {
        //实例化华硕外设工厂
        PeripheralFactory asusPeripheralFactory=new AsusPeripheralFactory();
        //生产华硕鼠标
        Mouse asusMouse=asusPeripheralFactory.createMouse();
        System.out.println(asusMouse.getMouse());
        //生产华硕键盘
        Keyboard asusKeyboard=asusPeripheralFactory.createKeyboard();
        System.out.println(asusKeyboard.getKeyboard());

        //实例化联想外设工厂
        PeripheralFactory lenovoPeripheralFactory=new LenovoPeripheralFactory();
        //生产联想鼠标
        Mouse lenovoMouse=lenovoPeripheralFactory.createMouse();
        System.out.println(lenovoMouse.getMouse());
        //生产华硕键盘
        Keyboard lenovoKeyboard=lenovoPeripheralFactory.createKeyboard();
        System.out.println(lenovoKeyboard.getKeyboard());
    }
}
