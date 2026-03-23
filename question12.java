
import java.util.Scanner;

public class question12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the balance: ");
        int amount=sc.nextInt();
        int option;

        while(true){
            System.out.print("Enter the option: ");
            option=sc.nextInt();
            switch(option){
                case 1:
                    System.out.println("Balance is: "+ amount);
                    break;
                case 2:
                    System.out.print("Enter the deposit amount: ");
                    int depositAmount=sc.nextInt();
                    amount+=depositAmount;
                    break;
                case 3:
                    System.out.print("Enter the withdraw amount: ");
                    int withdrawAmount=sc.nextInt();
                    if(withdrawAmount>amount){
                        System.out.println("Insufficient funds... ");
                    }
                    else{
                        amount-=withdrawAmount;
                    }
                    break;
                case 4:
                    System.out.println("Exit");
                    return;    
                default:
                    System.out.print("Enter valid option");
            }
        }
    }
}
