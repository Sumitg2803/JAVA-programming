import java.util.Scanner;

public class num_palindrome {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();
        int original = num;
        int reverse=0;

        while(num!=0){
            int digit=num%10;
            reverse=reverse * 10 + digit;
            num/=10;
        }
        if(original == reverse){
            System.out.println("The Number is a palindrome.");
        } else{
            System.out.println("The Number is not a palindrome");
        }
    }
}
