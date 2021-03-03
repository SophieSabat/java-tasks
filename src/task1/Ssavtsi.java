package task1;

public class Ssavtsi extends Animal{
    private String color;
    private String naturalEnvironment;

    public Ssavtsi() {
    }

    public Ssavtsi(String name, String type, String color, String naturalEnvironment) {
        super(name, type);
        this.color = color;
        this.naturalEnvironment = naturalEnvironment;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNaturalEnvironment() {
        return naturalEnvironment;
    }

    public void setNaturalEnvironment(String naturalEnvironment) {
        this.naturalEnvironment = naturalEnvironment;
    }

    @Override
    public String toString() {
        return "Ssavtsi{" +
                "color='" + color + '\'' +
                ", naturalEnvironment='" + naturalEnvironment + '\'' +
                "} " + super.toString();
    }
}
