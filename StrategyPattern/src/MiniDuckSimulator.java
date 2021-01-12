import duck.*;
import fly.FlyRocketPowered;

/**
 * @className: MiniDuckSimulator
 * @description: TODO 类描述
 * @author: WU Yuejiang
 * @date: 2021/1/11
 **/
public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.performQuack();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
