package factory.abstraction.lenovo;

import factory.abstraction.Keyboard;

/**
 * 联想键盘
 * @author ZhouHua
 * @date 2018/11/22
 */
public class LenovoKeyboard implements Keyboard {
    @Override
    public String getKeyboard() {
        return "联想的键盘";
    }
}
