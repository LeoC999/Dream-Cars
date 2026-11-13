package PluralSight.com;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class DealerShipFileReader {

    public TheDealerShip getDealerShip() {
        try {
            BufferedReader fr = new BufferedReader(new FileReader("DealerShipInfo.csv"));
            String reading = fr.readLine();

            String[] dealerInfo = reading.split("\\|");

                new TheDealerShip(
                    dealerInfo[0],
                    dealerInfo[1],
                    dealerInfo[2]);

            TheDealerShip dealership = new TheDealerShip("TestUser", "Test Address", "415-999-4123");

            return dealership;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
        public void saveDealership (TheDealerShip theDealerShip){
        }
    }
