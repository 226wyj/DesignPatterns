package displayBoards;

import weatherStation.*;

/**
 * @className: CurrentConditionsDisplay
 * @description: TODO 类描述
 * @author: WU Yuejiang
 * @date: 2021/1/13
 **/
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay (Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature
            + " F degrees and " + humidity + "% humidity");
    }
}
