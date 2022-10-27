package web.model;

public class Car {
    String model;
    int series;
    String ownerName;

    public Car(String model, int series, String ownerName) {
        this.model = model;
        this.series = series;
        this.ownerName = ownerName;
    }

    public String getModel() {
        return model;
    }

    public int getSeries() {
        return series;
    }

    public String getOwnerName() {
        return ownerName;
    }
}
