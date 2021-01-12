package quack;

import quack.QuackBehavior;

/**
 * @className: Squeak
 * @description: TODO 类描述
 * @author: WU Yuejiang
 * @date: 2021/1/11
 **/
public class Squeak implements QuackBehavior {
    @Override
    public void quack () {
        System.out.println("Squeak");
    }
}
