package task_3_2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        User user1 = new User(1, "Ivan", 23, Gender.MAN);
        User user2 = new User(2, "Alina", 19, Gender.WOMAN);
        User user3 = new User(3, "Nastya", 26, Gender.WOMAN);
        User user4 = new User(4, "Oleg", 17, Gender.MAN);
        User user5 = new User(5, "Vasya", 25, Gender.MAN);
        User user6 = new User(6, "Kyrylo", 20, Gender.MAN);
        User user7 = new User(7, "Karina", 19, Gender.WOMAN);
        User user8 = new User(8, "Katya", 22, Gender.WOMAN);
        User user9 = new User(9, "Olya", 33, Gender.WOMAN);
        User user10 = new User(10, "Viktor", 35, Gender.MAN);

        ArrayList<User> users = new ArrayList<User>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);
        users.add(user6);
        users.add(user7);
        users.add(user8);
        users.add(user9);
        users.add(user10);

        for (User u : users) {
            if (u.getId() %2 == 0) {
                System.out.println(u);
            }
        }

        System.out.println("_____________________________________");

        for (User u : users) {
            if (u.getName().length() > 5) {
                System.out.println(u);
            }
        }

        System.out.println("_____________________________________");

        for (User u : users) {
            if (u.getGender() == Gender.WOMAN) {
                System.out.println(u);
            }
        }
    }
}
