package PluralSight.com;

import java.math.BigDecimal;

public class MyDreamCars {
    double vin;
    double year;
    String make;
    String model;
    String color;
    String type;
    String odemmeter;
    BigDecimal price;

    public MyDreamCars(double vin, double year, String make, String model, String color, String type, String odemmeter, BigDecimal price) {
        this.vin = vin;
        this.year = year;
        this.make = make;
        this.model = model;
        this.color = color;
        this.type = type;
        this.odemmeter = odemmeter;
        this.price = price;
    }

    public double getVin() {
        return vin;
    }

    public double getYear() {
        return year;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }

    public String getOdemmeter() {
        return odemmeter;
    }

    public BigDecimal getPrice() {
        return price;
    }
}
