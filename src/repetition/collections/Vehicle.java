package repetition.collections;

public class Vehicle {
    private String make;
    private String model;
    private int price;
    private boolean fourWD;

    public Vehicle(String make, String model, int price, boolean fourWD) {
        this.make = make;
        this.model = model;
        this.price = price;
        this.fourWD = fourWD;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", fourWD=" + fourWD +
                '}';
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isFourWD() {
        return fourWD;
    }

    public void setFourWD(boolean fourWD) {
        this.fourWD = fourWD;
    }
}