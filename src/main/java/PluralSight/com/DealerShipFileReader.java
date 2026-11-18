package PluralSight.com;

import java.io.BufferedReader;
import java.io.FileReader;
import java.math.BigDecimal;


public class DealerShipFileReader {

    public TheDealerShip getDealerShip() {
        try {
            BufferedReader fr = new BufferedReader(new FileReader("DealerShipInfo.csv"));

            String reading = fr.readLine();
            String[] DealerInfo = reading.split("\\|");

            TheDealerShip dealerShip = new TheDealerShip(
                    DealerInfo[0],
                    DealerInfo[1],
                    DealerInfo[2]);


            String line;

            while ((line = fr.readLine()) != null) {

                String[] vehicleInfo = line.split("\\|");

                MyDreamCars car = new MyDreamCars(
                        vehicleInfo[0],
                        Integer.parseInt(vehicleInfo[1]),
                        vehicleInfo[2],
                        vehicleInfo[3],
                        vehicleInfo[4],
                        vehicleInfo[5],
                        Integer.parseInt(vehicleInfo[6]),
                        new BigDecimal(vehicleInfo[7])
                );

                dealerShip.addToMyDreamCars(car);
            }


            fr.close();

            return dealerShip;

        } catch (Exception e) {
            e.printStackTrace();
        }

       return null;
    }

}