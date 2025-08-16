import java.util.Scanner;

public class largest_num {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        int a= sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int b= sc.nextInt();
        System.out.print("Enter 3rd number: ");
        int c= sc.nextInt();

        if (a == b || a == c || b == c) {
            System.out.println("Invalid inputs: Numbers must be distinct");
        } else {
            int largest;
            if (a > b && a > c)
                largest = a;
            else if (b > a && b > c)
                largest = b;
            else
                largest = c;

            System.out.println("The largest number among given three numbers is: " + largest);
        }
    }
}
