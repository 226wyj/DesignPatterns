package displayBoards;

import weatherStation.DisplayElement;
import weatherStation.Observer;
import weatherStation.Subject;
import weatherStation.WeatherData;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * @className: StatisticsDisplay
 * @description: TODO 类描述
 * @author: WU Yuejiang
 * @date: 2021/1/13
 **/
public class StatisticsDisplay implements Observer, DisplayElement {
    private ArrayList temperatures;
    private float avgTemp;
    private float maxTemp;
    private float minTemp;
    private Subject weatherData;

    public StatisticsDisplay(Subject weatherData) {
        temperatures = new ArrayList();
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    private float getMaxTemp(ArrayList a) {
        float result = (float) a.get(0);
        for (int i = 0; i < a.size(); i++) {
            if ((float) a.get(i) > result)
                result = (float) a.get(i);
        }
        return result;
    }

    private float getMinTemp(ArrayList a) {
        float result = (float) a.get(0);
        for (int i = 0; i < a.size(); i++) {
            if ((float) a.get(i) < result)
                result = (float) a.get(i);
        }
        return result;
    }

    private float getAvgTemp(ArrayList a) {
        if (a.size() == 0)
            return 0;
        float sum = 0;
        for (int i = 0; i < a.size(); i++) {
            sum += (float) a.get(i);
        }
        return sum / a.size();
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        temperatures.add(temperature);
        this.maxTemp = this.getMaxTemp(temperatures);
        this.minTemp = this.getMinTemp(temperatures);
        this.avgTemp = this.getAvgTemp(temperatures);
        display();
    }

    @Override
    public void display() {
        System.out.println("Statistics conditions: Max temperature " + maxTemp
                + " F degrees, Min temperature " + minTemp + " F degrees and " +
                " average temperature " + avgTemp + " F degrees.");
    }
}
