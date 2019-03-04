package factory.abstraction.lenovo;

import factory.abstraction.Mouse;

/**
 * 联想鼠标
 * @author ZhouHua
 * @date 2018/11/22
 */
public class LenovoMouse implements Mouse {
    @Override
    public String getMouse() {
        return "联想的鼠标";
    }
}
