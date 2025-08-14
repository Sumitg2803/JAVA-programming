import java.util.Scanner;

public class number_check {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number:");
        int num = sc.nextInt();

        if (num >0)
            System.out.println("Number is positive");
        else if (num == 0) {
            System.out.println("It is Zero");
        } else
            System.out.println("Number is negative");
    }
}
