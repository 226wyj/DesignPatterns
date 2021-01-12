package fly;

import fly.FlyBehavior;

/**
 * @className: FLyNoWay
 * @description: TODO 类描述
 * @author: WU Yuejiang
 * @date: 2021/1/11
 **/
public class FLyNoWay implements FlyBehavior {
    @Override
    public void fly () {
        System.out.println("I can't fly");
    }
}
