package task1;

public class Khyzhi extends Ssavtsi {
    private String eat;

    public Khyzhi() {
    }

    public Khyzhi(String name, String type, String color, String naturalEnvironment, String eat) {
        super(name, type, color, naturalEnvironment);
        this.eat = eat;
    }

    public String getEat() {
        return eat;
    }

    public void setEat(String eat) {
        this.eat = eat;
    }

    @Override
    public String toString() {
        return "Khyzhi{" +
                "eat='" + eat + '\'' +
                "} " + super.toString();
    }
}
