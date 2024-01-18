package exceptionHandling.lab;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DataValidation {
    public static void main(String[] args) {
        try {
            // Create a BufferedReader to read the data from the file.
            BufferedReader reader = new BufferedReader(new FileReader("financial-data.csv"));

            // Create a list to store the parsed data.
            List<FinancialData> data = new ArrayList<>();

            // Read each line in the file and parse it into a FinancialData object.
            for (String line = reader.readLine(); line != null; line = reader.readLine()) {
                // Split the line into columns.
                String[] columns = line.split(",");

                // Create a FinancialData object from the columns.
                FinancialData financialData = new FinancialData(new Date(Long.parseLong(columns[0])), Long.parseLong(columns[1]), Long.parseLong(columns[2]), Long.parseLong(columns[3]), Long.parseLong(columns[4]), Long.parseLong(columns[5]));

                // Add the FinancialData object to the list.
                data.add(financialData);
            }

            // Close the BufferedReader.
            reader.close();

            // Print the list of FinancialData objects.
            for (FinancialData financialData : data) {
                System.out.println(financialData);
            }
        } catch (IOException e) {
            // Handle the IOException.
            System.out.println("Error reading file: " + e.getMessage());
        }
        catch (NumberFormatException e) {
            System.out.println("Invalid input.");
        }
        catch (NullPointerException e) {
            System.out.println("Null values found.");
        }
    }
}

// The record is of type FinancialData which is described as follows
class FinancialData {

    // instance variables
    private final Date date;
    private final Long open;
    private final Long high;
    private final Long low;
    private final Long close;
    private final Long volume;

    // constructor
    public FinancialData(Date date, Long open, Long high, Long low, Long close, Long volume) {
        this.date = date;
        this.open = open;
        this.high = high;
        this.low = low;
        this.close = close;
        this.volume = volume;
    }

    // Setter and Getter methods
    public Date getDate() {
        return date;
    }

    public Long getOpen() {
        return open;
    }

    public Long getHigh() {
        return high;
    }

    public Long getLow() {
        return low;
    }

    public Long getClose() {
        return close;
    }

    public Long getVolume() {
        return volume;
    }

    // toString method
    @Override
    public String toString() {
        return "FinancialData{" +
                "date='" + date + '\'' +
                ", open='" + open + '\'' +
                ", high='" + high + '\'' +
                ", low='" + low + '\'' +
                ", close='" + close + '\'' +
                ", volume='" + volume + '\'' +
                '}';
    }
}
