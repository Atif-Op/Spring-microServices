package comparable.predicate;

public class Car {
    String carName;
    int price;


    public Car(String carName, int price) {
        this.carName = carName;
        this.price = price;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCarName() {
        return carName;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carName='" + carName + '\'' +
                ", price=" + price +
                '}';
    }
}
