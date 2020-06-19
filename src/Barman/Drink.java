package Barman;

public class Drink {
    private String name;
    private boolean alko;
    private double price;

    public Drink() {
    }

    public Drink(String name, boolean alko, double price) {
        this.name = name;
        this.alko = alko;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAlko() {
        return alko;
    }

    public void setAlko(boolean alko) {
        this.alko = alko;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "name='" + name + '\'' +
                ", alko=" + alko +
                ", price=" + price +
                '}';
    }
}
