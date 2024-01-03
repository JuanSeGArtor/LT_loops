package collections;

import java.util.*;

public class TemperatureRecordConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<TemperatureRecord> farenheitRecords = new ArrayList<>();

        System.out.println("Ingrese la cantidad de temperaturas Farenheit a registrar");
        int cantRecords = sc.nextInt();

        for (int i = 0; i < cantRecords; i++) {
            System.out.println("Ingrese la fecha:");
            date date;

            System.out.println("Ingrese la hora:");
            time time;

            System.out.println("Ingrese la temperatura en Farenheit:");
            double temperature;

            TemperatureRecord record = new TemperatureRecord(date, time, temperature);
            farenheitRecords.add(record);
        }



        sc.close();
    }

    // Método de conversion de lista Farenheit a lista Celsius
    public List<TemperatureRecord> convertToCelsiusRecord(List<TemperatureRecord> farenheitRecords) {
        List<TemperatureRecord> celciusRecords = new ArrayList<>();

        for (TemperatureRecord temperature : celciusRecords) {
            double celsius = (temperature.getTemperature()-32) * 5/9;
            celciusRecords.add(celsius);
        }

        return celciusRecords;
    }
}
