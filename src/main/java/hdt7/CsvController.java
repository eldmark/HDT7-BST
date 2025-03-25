package hdt7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class CsvController {
    public static ArrayList<HomeAppliances> getFromCsv(
        String filePath
    ) {
        ArrayList<HomeAppliances> accesorios = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;
            br.readLine();
            
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                try {
                    String priceRetailStr = values[9].trim(); 
                    String priceCurrentStr = values[10].trim();
                
                    double priceRetail = (
                        priceRetailStr.isEmpty() ? 
                        0 :
                        Double.parseDouble(priceRetailStr
                    ));

                    double priceCurrent = (
                        priceCurrentStr.isEmpty() ?
                        0 : 
                        Double.parseDouble(priceCurrentStr)
                    );
                    
                    // nuevo accesorio
                    HomeAppliances homeAppliance = new HomeAppliances(
                        values[0], 
                        values[6], 
                        priceRetail, 
                        priceCurrent, 
                        values[18]
                    );
                    accesorios.add(homeAppliance);  
                } catch (Exception e) {}
            }
        } catch (Exception e) {}
        return accesorios;
    }
}
