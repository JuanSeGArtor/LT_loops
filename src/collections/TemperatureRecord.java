package collections;

import java.time.LocalDate;
import java.time.LocalTime;

public class TemperatureRecord {
    private LocalDate date;
    private LocalTime time;
    private double temperature;

    // Getters & Setters
    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public TemperatureRecord(LocalDate date, LocalTime time, double temperature) {
        this.date = date;
        this.time = time;
        this.temperature = temperature;
    }
}
