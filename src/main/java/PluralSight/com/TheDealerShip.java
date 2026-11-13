package PluralSight.com;

import java.util.ArrayList;

public class TheDealerShip {
    private String userName;
    private String userAddress;
    private String userPhoneNumber;
     ArrayList<MyDreamCars>inventory;

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
        return null;
       }
    public ArrayList<MyDreamCars> getMyDreamCarsByMake(String make) {
        return null;
    }
    public ArrayList<MyDreamCars> getMyDreamCarsByModel(String model) {
        return null;
    }
    public ArrayList<MyDreamCars> getMyDreamCarsByYear(double year) {
        return null;
    }
    public ArrayList<MyDreamCars> getMyDreamCarsByColor(String color) {
        return null;
    }
    public ArrayList<MyDreamCars> getMyDreamCarsByMilage(double milage) {
        return null;
    }
    public ArrayList<MyDreamCars> getMyDreamCarsByType(String type) {
        return null;
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

