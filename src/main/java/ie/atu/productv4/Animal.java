package ie.atu.productv4;

import java.text.NumberFormat;

public class Animal implements Productable {

    private String type;
    private int age;
    private String breed;
    private double price;
    protected static int count = 0;

    public Animal() {
        this.type = "";
        this.age = 0;
        this.breed = "";
        this.price = 0;
    }

    public Animal(String type, int age, String breed, double price) {
        this.type = type;
        this.age = age;
        this.breed = breed;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Animal.count = count;
    }

    public String getPriceFormatted() {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return currency.format(price);
    }
}


