package PluralSight.com;

import java.math.BigDecimal;
import java.util.ArrayList;

public class TheDealerShip {
    private String userName;
    private String userAddress;
    private String userPhoneNumber;
    private ArrayList<MyDreamCars>inventory;

    //The dealership conductor

    public TheDealerShip(String userName, String userAddress, String userPhoneNumber) {
        this.userName = userName;
        this.userAddress = userAddress;
        this.userPhoneNumber = userPhoneNumber;

        inventory = new ArrayList<>();
    }
    //The regular getters are here

    public String getUserName() {
        return userName;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public String getUserPhoneNumber() {
        return userPhoneNumber;
    }

//The extra getters for the other classes
//Now I know, when the file works I have to but index numbers for the file, and get all, would be the entire file
//Edit so the arraylist was supposed to go first
//And to add and remove inventory just call the inventory

    public ArrayList<MyDreamCars> getMyDreamCarsByPrice(double minPrice, double maxPrice) {
        ArrayList<MyDreamCars> match = new ArrayList<>();
        for (MyDreamCars myDreamCars : inventory) {

            BigDecimal min = BigDecimal.valueOf(minPrice);
            BigDecimal max = BigDecimal.valueOf(maxPrice);

            if (myDreamCars.getPrice().compareTo(min) >= 0 &&
                    myDreamCars.getPrice().compareTo(max) <= 0) {

                match.add(myDreamCars);
            }
        }
        return match;
       }

    public ArrayList<MyDreamCars> getMyDreamCarsByMake(String make) {
        ArrayList<MyDreamCars> match = new ArrayList<>();
        for (MyDreamCars myDreamCars : inventory) {
            if (myDreamCars.getMake().equals(make)) {
                match.add(myDreamCars);
            }
        }
        return match;
    }

    public ArrayList<MyDreamCars> getMyDreamCarsByModel(String model) {
      ArrayList<MyDreamCars> match = new ArrayList<>();
      for (MyDreamCars myDreamCars : inventory) {
          if (myDreamCars.getModel().equals(model)) {
              match.add(myDreamCars);
          }
      }
      return match;
    }
    public ArrayList<MyDreamCars> getMyDreamCarsByYear(int year) {
      ArrayList<MyDreamCars> match = new ArrayList<>();
      for (MyDreamCars myDreamCars : inventory) {
          if (myDreamCars.getYear() == year) {
              match.add(myDreamCars);
          }
      }
      return match;
    }

    public ArrayList<MyDreamCars> getMyDreamCarsByColor(String color) {
        ArrayList<MyDreamCars> match = new ArrayList<>();
        for (MyDreamCars myDreamCars : inventory) {
            if (myDreamCars.getColor().equals(color)) {
                match.add(myDreamCars);
            }
        }
        return match;
    }

    public ArrayList<MyDreamCars> getMyDreamCarsByMilage(int milage) {
        ArrayList<MyDreamCars> match = new ArrayList<>();
        for (MyDreamCars myDreamCars : inventory) {
            if(myDreamCars.getOdometer() <= milage) {
                match.add(myDreamCars);
            }
        }
        return match;
    }
    public ArrayList<MyDreamCars> getMyDreamCarsByType(String type) {
        ArrayList<MyDreamCars> match = new ArrayList<>();
        for (MyDreamCars myDreamCars : inventory) {
            if (myDreamCars.getType().equalsIgnoreCase(type)) {
                match.add(myDreamCars);
            }
        }
        return match;
    }
    public ArrayList<MyDreamCars> getAllMyDreamCars() {
        return inventory;
    }
    public void addToMyDreamCars(MyDreamCars myDreamCars) {
        inventory.add(myDreamCars);
    }
    public void removeFromMyDreamCars(MyDreamCars myDreamCars) {
        inventory.remove(myDreamCars);
    }
}

