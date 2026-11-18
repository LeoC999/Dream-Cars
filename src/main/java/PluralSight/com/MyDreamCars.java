package PluralSight.com;

import java.math.BigDecimal;

public class MyDreamCars {
    private String vin;
    private int year;
    private String make;
    private String model;
    private String color;
    private String type;
    private int odometer;
    private BigDecimal price;

    public MyDreamCars(String vin, int year, String make, String model, String color, String type, int odemmeter, BigDecimal price) {
        this.vin = vin;
        this.year = year;
        this.make = make;
        this.model = model;
        this.color = color;
        this.type = type;
        this.odometer = odemmeter;
        this.price = price;
    }

    public String getVin() {
        return vin;
    }

    public int getYear() {
        return year;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }

    public BigDecimal getPrice() {
        return price;
    }
}
