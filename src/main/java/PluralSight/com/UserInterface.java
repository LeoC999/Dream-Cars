package PluralSight.com;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
private TheDealerShip theDealerShip;

public void display() {
    initialize();

    Scanner dreamCarReader = new Scanner(System.in);

    boolean running = true;
    while (running) {

        System.out.println("Enter 1 for my showcase of my cars");
        System.out.println("Enter 99 to quit out of my dreams.");

        int command = dreamCarReader.nextInt();

        switch (command) {
            case 1:
                processGetAllTheCars();
                break;
            case 2:
                running = false;
                break;

        }
    }
}

private void initialize(){
    DealerShipFileReader dealerShipFileReader = new DealerShipFileReader();
    theDealerShip = dealerShipFileReader.getDealerShip();
}


private void displayTheDealerShip(ArrayList<TheDealerShip> theDealerShips){

}

private void processGetAllTheCars(){
ArrayList<MyDreamCars> veicles = theDealerShip.getAllMyDreamCars();
displayTheDealerShip(veicles);
}
}
