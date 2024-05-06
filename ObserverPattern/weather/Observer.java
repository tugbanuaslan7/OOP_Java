public interface Observer {
    public void update(float temp, float humidity, float pressure);
// temp, humidity, pressure are passed from the Subject when a measurement changes
}
