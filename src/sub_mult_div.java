import java.util.Scanner;

public class sub_mult_div {
    public static void main (String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter first number= ");
        int a= sc.nextInt();
        System.out.print("Enter second number= ");
        int b= sc.nextInt();

        int sub = a-b;
        int mul = a*b;
        double div = (double) a/b;

        System.out.println("Subtraction = " + sub);
        System.out.println("Multiplication = " + mul);
        System.out.println("Division = " + div);

    }
}
