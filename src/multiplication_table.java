import java.util.Scanner;

public class multiplication_table {
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int num = scan.nextInt();

        for (int i=1; i<=10; i++){
            System.out.println(num + "x" + i + "=" + (num*i));
        }
    }
}