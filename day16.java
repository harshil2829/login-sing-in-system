import java.util.ArrayList;
import java.util.Scanner;

class User {
    String username;
    String password;

    User(String username, String password) {
        this.username = username;
        this.password = password;
    }
}

public class day16 {

    static ArrayList<User> users = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n===== Login System =====");
            System.out.println("1. Signup");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Choose: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> signup();
                case 2 -> login();
                case 3 -> System.out.println("Bye!");
                default -> System.out.println("Invalid choice!");
            }

        } while (choice != 3);
    }

    static void signup() {
        System.out.print("Enter username: ");
        String username = sc.nextLine();

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        users.add(new User(username, password));
        System.out.println("Signup successful!");
    }

    static void login() {
        System.out.print("Enter username: ");
        String username = sc.nextLine();

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        for (User u : users) {
            if (u.username.equals(username) && u.password.equals(password)) {
                System.out.println("Login successful! Welcome " + username);
                return;
            }
        }

        System.out.println("Invalid username or password!");
    }
}
