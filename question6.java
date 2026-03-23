import java.util.Scanner;

public class question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password = "secret@123";
        String userpassword;
        do {
            System.out.print("Enter the password: ");
            userpassword = sc.nextLine();

            if (!userpassword.equals(password)) {
                System.out.println("Incorrect password... Try again!!!");
            }

        }
        while (!userpassword.equals(password));
        System.out.println("Access Granted!");
    }
}
