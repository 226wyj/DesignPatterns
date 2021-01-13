package displayBoards;

import weatherStation.DisplayElement;
import weatherStation.Observer;
import weatherStation.Subject;

/**
 * @className: ForecastDisplay
 * @description: TODO 类描述
 * @author: WU Yuejiang
 * @date: 2021/1/13
 **/
public class ForecastDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private float pressure;
    private Subject weatherData;

    public ForecastDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.println("Future conditions: " + temperature
                + " F degrees, " + humidity + "% humidity, and " +
                " pressure " + pressure);
    }
}
