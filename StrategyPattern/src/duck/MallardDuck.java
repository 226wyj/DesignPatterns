package duck;

import fly.FlyWithWings;
import quack.Quack;

/**
 * @className: MallardDuck
 * @description: TODO 类描述
 * @author: WU Yuejiang
 * @date: 2021/1/11
 **/
public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
