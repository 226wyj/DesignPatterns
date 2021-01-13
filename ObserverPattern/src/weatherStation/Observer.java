package weatherStation;

/**
 * @className: Observer
 * @description: TODO 类描述
 * @author: WU Yuejiang
 * @date: 2021/1/13
 **/
public interface Observer {
    public void update(float temp, float humidity, float pressure);
}
