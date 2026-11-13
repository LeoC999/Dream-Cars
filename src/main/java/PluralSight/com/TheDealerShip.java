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
//The extra gettors for the other classes

    public  class getMyDreamCarsByPrice{
        public ArrayList<MyDreamCars> getMyDreamCarsByPrice(double minPrice, double maxPrice) {
            return getMyDreamCarsByPrice(minPrice, maxPrice);
        }
    }
    public class getMyDreamCarsByMake{
        public ArrayList<MyDreamCars> getMyDreamCarsByMake(double make, double model) {
            return getMyDreamCarsByMake(make, model);
        }
    }
    public class getMyDreamCarsByYear{
        public ArrayList<MyDreamCars> getMyDreamCarsByYear(double year) {
            return getMyDreamCarsByYear(year);
        }
    }
    public class getMyDreamCarsByColor{
        public ArrayList<MyDreamCars> getMyDreamCarsByColor(String color) {
            return getMyDreamCarsByColor(color);
        }
    }

}
