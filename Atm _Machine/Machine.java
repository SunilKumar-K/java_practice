import java.util.Scanner;

public class Machine{
    public static void main(String[] args) {
        System.out.println("Welcome to the Oiasis Bank ");
        System.out.println("Enter 1, To check history of your account");
        System.out.println("Enter 2, For Withdraw amount form your account");
        System.out.println("Enter 3, Deposit amount into your account ");
        System.out.println("Enter 4, Transfer amount form your account ");
        System.out.println("Enter 5, To Quit form account");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter option to continue on your bank account");
        int option = sc.nextInt();
        switch (option){
            case 1 :{
                System.out.println("you are entering into your account history ");
             
             
                break;
            }
            case 2:{
                System.out.println("Enter how much amount is to be withdraw form your account ");
                Float withdrawAmount = sc.nextFloat();
                // we add function here
             
             
                break; 
            }
            case 3:{
                System.out.println("Enter how much amount is deposit into your account");
                Float depositAmount = sc.nextFloat();
           
           
                break;
            }
            case 4:{
                System.out.println("How much amount is to transfer to another account");
                Float transferAmount = sc.nextFloat();


                break;
            }
            case 5:{
                System.out.println("Thanks for visiting Oiasis bank, you are quitting form your account");
               
              
                break;
            }
        }
    }
}