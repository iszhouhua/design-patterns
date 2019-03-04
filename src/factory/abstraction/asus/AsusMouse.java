package factory.abstraction.asus;

import factory.abstraction.Mouse;

/**
 * 华硕鼠标
 * @author ZhouHua
 * @date 2018/11/22
 */
public class AsusMouse implements Mouse {
    @Override
    public String getMouse() {
        return "华硕的鼠标";
    }
}
