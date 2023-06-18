import java.util.*;
public class calculator{
    public static void main(String[] args)
    {
        System.out.println("Welcome to speed X calculator");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter what you wanna do between two numbers means operator");
        String operator = sc.next();
        calculation(operator);
    }
    public static void calculation(String operator){
        System.out.println("Then enter two numbers");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        switch(operator)
        {
            case "+" : {
                System.out.println("Sum of two numbers is "+ add(a,b));
                break;
            }
            case "-" : {
                System.out.println("Subtraction of two numbers is "+ sub(a,b));
                break;
            }            
            case "*" : {
                System.out.println("Multiplication of two numbers is "+ mul(a,b));
                break;
            }
            case "/" : {
                System.out.println("Division of two numbers is "+ div(a,b));
                break;
            }
            case "%" : {
                System.out.println("Remiender of two numbers is "+ rem(a,b));
                break;
            }
            default : {
                System.out.println("You entered wrong operator check it once + - * / %");
            }
        }

    }
    public static int add(int a ,int b)
    {
        return a+b;
    }
    public static int sub(int a,int b)
    {
        return a-b;
    }
    public static int mul(int a , int b)
    {
        return a*b;
    }
    public static float div(int a, int b)
    {
        return a/b;
    }
    public static int rem(int a , int b)
    {
        return a%b;
    }
}