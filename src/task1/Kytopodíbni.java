package task1;

public class Kytopodíbni extends Ssavtsi{
    private String eat;;

    public Kytopodíbni() {
    }

    public Kytopodíbni(String name, String type, String color, String naturalEnvironment, String eat) {
        super(name, type, color, naturalEnvironment);
        this.eat = eat;
    }

    @Override
    public String getName() {
        return eat;
    }

    @Override
    public void setName(String name) {
        this.eat = name;
    }

    @Override
    public String toString() {
        return "Kytopodíbni{" +
                "eat='" + eat + '\'' +
                "} " + super.toString();
    }
}
