import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Csv2
{
    public static void main(String[] args) {
        String csvFile = "Student.csv";
        List<String[]> data = new ArrayList<>();

        try (CSVReader csvReader = new CSVReader(new FileReader(csvFile))) {
            data = csvReader.readAll(); // Read all rows from the CSV file
        } catch (IOException | CsvException e) {
            e.printStackTrace();
        }

        for (String[] row : data) {
            for (String cell : row) {
                System.out.print(cell + "\t");
            }
            System.out.println();
        }
    }
}


// *Different Culture, *Equality, *Good Infrastructure *CMMI level-5 *Good Staff 