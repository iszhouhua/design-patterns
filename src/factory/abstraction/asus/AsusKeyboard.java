package factory.abstraction.asus;

import factory.abstraction.Keyboard;

/**
 * 华硕键盘
 * @author ZhouHua
 * @date 2018/11/22
 */
public class AsusKeyboard implements Keyboard {
    @Override
    public String getKeyboard() {
        return "华硕的键盘";
    }
}
