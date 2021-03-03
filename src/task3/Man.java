package task3;

public class Man implements MensClothes{
    private String name;
    private int age;
    private String colorOfTheSuit;

    public Man() {
    }

    public Man(String name, int age, String colorOfTheSuit) {
        this.name = name;
        this.age = age;
        this.colorOfTheSuit = colorOfTheSuit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColorOfTheSuit() {
        return colorOfTheSuit;
    }

    public void setColorOfTheSuit(String colorOfTheSuit) {
        this.colorOfTheSuit = colorOfTheSuit;
    }

    @Override
    public void toDressAMen() {
        System.out.println("Man dressed in a " + colorOfTheSuit + " suit");
    }

    @Override
    public String toString() {
        return "Man{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", colorOfTheSuit='" + colorOfTheSuit + '\'' +
                '}';
    }
}
