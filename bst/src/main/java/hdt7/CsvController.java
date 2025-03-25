package hdt7;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CsvController {
    public ArrayList<HomeAppliances> getFromCsv(String filePath) {
        ArrayList<HomeAppliances> appliances = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            // Skip the header row
            br.readLine();
            
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                try {

                    String priceRetailStr = values[9].trim(); 
                    String priceCurrentStr = values[10].trim();
                
                    double priceRetail = priceRetailStr.isEmpty() ? 0 : Double.parseDouble(priceRetailStr);
                    double priceCurrent = priceCurrentStr.isEmpty() ? 0 : Double.parseDouble(priceCurrentStr);
                    
                    HomeAppliances homeAppliance = new HomeAppliances(
                         values[0], values[1], values[2], values[3], values[4], values[5], values[6], values[7], values[8], priceRetail, priceCurrent, values[11], values[12], values[13], values[14], values[15], values[16], Integer.parseInt(values[17]), values[18], values[19]
                    );
                    appliances.add(homeAppliance);  
                } catch (NumberFormatException e) {
                    // Handle or log invalid number format
                    System.err.println("Invalid price format: " + values[9] + ", " + values[10]);
                    continue;
                } catch (ArrayIndexOutOfBoundsException e) {
                    // Handle rows with missing columns
                    System.err.println("Invalid row format: " + line);
                    continue;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return appliances;
    }
}
