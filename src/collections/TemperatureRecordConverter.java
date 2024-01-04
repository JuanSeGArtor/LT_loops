package collections;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;

public class TemperatureRecordConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<TemperatureRecord> fahrenheitRecords = new ArrayList<>();

        System.out.println("Ingrese la cantidad de registros de temperaturas Farenheit a realizar");
        int cantRecords = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < cantRecords; i++) {
            System.out.println("Temperatura (" + (i+1) + ")");

            System.out.println("Ingrese la fecha (formato YYYY-MM-DD):");
            String dateStr = sc.next();
            LocalDate date = LocalDate.parse(dateStr);

            System.out.println("Ingrese la hora (formato HH:MM:SS):");
            String timeStr = sc.next();
            LocalTime time = LocalTime.parse(timeStr);

            System.out.println("Ingrese la temperatura en Fahrenheit:");
            double temperature = sc.nextDouble();

            System.out.println("-----------------------------------------");

            TemperatureRecord record = new TemperatureRecord(date, time, temperature);
            fahrenheitRecords.add(record);
        }

        // Convertir a Celsius
        TemperatureRecordConverter converter = new TemperatureRecordConverter();
        // Llamada al método de conversión
        List<TemperatureRecord> celsiusRecords = converter.convertToCelsiusRecord(fahrenheitRecords);

        // Imprimir registros Celsius
        System.out.println("Registros en Celsius:");
        for (TemperatureRecord record : celsiusRecords) {
            System.out.println("Fecha: " + record.getDate() + " Hora: " + record.getTime() + " Temperatura: " + record.getTemperature());
        }

        sc.close();
    }

    // Método de conversion de lista Farenheit a lista Celsius
    public List<TemperatureRecord> convertToCelsiusRecord(List<TemperatureRecord> fahrenheitRecords) {
        List<TemperatureRecord> celsiusRecords = new ArrayList<>();


        for (TemperatureRecord temperatureRecord : fahrenheitRecords) {
            double celsius = (temperatureRecord.getTemperature() - 32) * 5 / 9;
            TemperatureRecord celsiusRecord = new TemperatureRecord(
                    temperatureRecord.getDate(),
                    temperatureRecord.getTime(),
                    celsius
            );
            celsiusRecords.add(celsiusRecord);
        }

        return celsiusRecords;
    }
}
