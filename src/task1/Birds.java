package task1;

public class Birds extends Animal{
    private boolean fly;
    private String naturalEnvironment;

    public Birds() {
    }

    public Birds(String name, String type, boolean fly, String naturalEnvironment) {
        super(name, type);
        this.fly = fly;
        this.naturalEnvironment = naturalEnvironment;
    }

    public boolean isFly() {
        return fly;
    }

    public void setFly(boolean fly) {
        this.fly = fly;
    }

    public String getNaturalEnvironment() {
        return naturalEnvironment;
    }

    public void setNaturalEnvironment(String naturalEnvironment) {
        this.naturalEnvironment = naturalEnvironment;
    }

    @Override
    public String toString() {
        return "Birds{" +
                "fly=" + fly +
                ", naturalEnvironment='" + naturalEnvironment + '\'' +
                "} " + super.toString();
    }
}
