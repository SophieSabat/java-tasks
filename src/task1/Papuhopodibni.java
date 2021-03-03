package task1;

public class Papuhopodibni extends Birds{
    private String color;

    public Papuhopodibni() {
    }

    public Papuhopodibni(String name, String type, boolean fly, String naturalEnvironment, String color) {
        super(name, type, fly, naturalEnvironment);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Papuhopodibni{" +
                "color='" + color + '\'' +
                "} " + super.toString();
    }
}
