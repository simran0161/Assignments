
import java.util.Scanner;

public class question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int n = num;
        int rev=0;

        while (n != 0) {
            int rem=n%10;
            rev=rev*10+rem;
            n = n/10;
        }

        if(rev==num){
            System.out.println("Number is a palindrome number");
        }
        else{
            System.out.println("Not a palindrome number");
        }
    }
}
