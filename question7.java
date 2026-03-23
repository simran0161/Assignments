import java.util.Scanner;

public class question7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        System.out.print("Fibonacci Series : ");

        int a=0;
        int b=1;
        System.out.print(a+" ");
        System.out.print(b+" ");
        int i=1;
        while(i<n){
            int c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
            i++;
        }
    }
}
