package task3 ;

public class Woman implements WomensClothes{
    private String name;
    private int age;
    private String colorOfTheDress;

    public Woman() {
    }

    public Woman(String name, int age, String colorOfTheDress) {
        this.name = name;
        this.age = age;
        this.colorOfTheDress = colorOfTheDress;
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

    public String getColorOfTheDress() {
        return colorOfTheDress;
    }

    public void setColorOfTheDress(String colorOfTheDress) {
        this.colorOfTheDress = colorOfTheDress;
    }

    @Override
    public void toDressAWoman() {
        System.out.println("Woman dressed in a " + colorOfTheDress + " dress");
    }

    @Override
    public String toString() {
        return "Woman{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", colorOfTheDress='" + colorOfTheDress + '\'' +
                '}';
    }
}
