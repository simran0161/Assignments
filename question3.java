
import java.util.Scanner;

public class question3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any character: ");
        char ch=sc.next().charAt(0);
        ch = Character.toLowerCase(ch);

        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("It is a Vowel");
                break;
            default:
                if(ch>='a' && ch<='z') {
                    System.out.println("It is a Consonant");
                }
                else{
                    System.out.println("Invalid input");
                }
        }
    }
}
