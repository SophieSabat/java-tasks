public class Main {
    public static void main(String[] args) {


        User ira = new User(1, "Ira", new String[] {"java", "c++"});

        System.out.println(ira);


        User vasya = new User(
                2,
                "Vasya",
                new String[] {"html", "css", "js", "java"},
                new Wallet("leather", "red", 5000),
                new Car("black", "Mercedes", 3.2, 2008)
                );

        System.out.println(vasya);
    }
}
