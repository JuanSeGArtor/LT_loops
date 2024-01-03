package collections;

public class TemperatureRecord {
    private date date;
    private time time;
    private double temperature;

    // Getters & Setters
    public date getDate() {
        return date;
    }

    public void setDate(date date) {
        this.date = date;
    }

    public time getTime() {
        return time;
    }

    public void setTime(time time) {
        this.time = time;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public TemperatureRecord(date date, time time, double temperature) {
        this.date = date;
        this.time = time;
        this.temperature = temperature;
    }


}
