package quack;

/**
 * @className: Quack
 * @description: TODO 类描述
 * @author: WU Yuejiang
 * @date: 2021/1/11
 **/
public class Quack implements QuackBehavior {
    @Override
    public void quack () {
        System.out.println("Quack");
    }
}
