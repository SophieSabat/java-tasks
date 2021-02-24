public class Car {
    private String color;
    private String model;
    private double engine;
    private int year;


    public Car() {
    }

    public Car(String color, String model, double engine, int year) {
        this.color = color;
        this.model = model;
        this.engine = engine;
        this.year = year;
    }


    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }

    public void setModel(String model) {
        this.model = model;
    }
    public String getModel() {
        return model;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }
    public double getEngine() {
        return engine;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public int getYear() {
        return year;
    }


    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", engine=" + engine +
                ", year=" + year +
                '}';
    }
}
