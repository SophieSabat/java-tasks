import java.util.Arrays;

public class User {
    private int id;
    private String name;
    private String[] skills;
    private Wallet wallet;
    private Car car;


    public User() {
    }

    public User(int id, String name, String[] skills) {
        this.id = id;
        this.name = name;
        this.skills = skills;
    }

    public User(int id, String name, String[] skills, Wallet wallet, Car car) {
        this.id = id;
        this.name = name;
        this.skills = skills;
        this.wallet = wallet;
        this.car = car;
    }


    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", skills=" + Arrays.toString(skills) +
                ", wallet=" + wallet +
                ", car=" + car +
                '}';
    }
}
