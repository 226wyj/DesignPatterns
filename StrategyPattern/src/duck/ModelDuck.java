package duck;

import fly.FLyNoWay;
import quack.Quack;

/**
 * @className: ModelDuck
 * @description: TODO 类描述
 * @author: WU Yuejiang
 * @date: 2021/1/11
 **/
public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FLyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
