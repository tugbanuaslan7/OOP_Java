import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
    private List<Observer> observers; // List of observer we will register or unregister
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList<Observer>();
    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    // this method lets observers know about the temp., hum, and press.
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
    }

    // whenever there occurs a change, notify the observers
    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        // you see, there is a change, trigger.
        measurementsChanged();
    }

    // other WeatherData methods here, skipped
}
