package weatherStation;

/**
 * @className: Subject
 * @description: TODO 类描述
 * @author: WU Yuejiang
 * @date: 2021/1/13
 **/
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
