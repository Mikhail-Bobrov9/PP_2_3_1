package web.models;

public class Car {

    private int id;
    private String model;
    private String carColor;


    public Car(int id, String model, String carColor) {
        this.id = id;
        this.model = model;
        this.carColor = carColor;

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", carColor='" + carColor + '\'' +
                '}';
    }
}
