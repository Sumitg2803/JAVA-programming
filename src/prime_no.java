import java.util.Scanner;

public class prime_no {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num =  sc.nextInt();

        boolean isPrime= true;

        if(num<=1) {
            isPrime= false;
        } else{
            for(int i= 2; i<=Math.sqrt(num); i++){
                if(num% i == 0){
                    isPrime= false;
                    break;
                }
            }
        }
        if(isPrime) {
            System.out.println("The Number is Prime.");
        }else{
            System.out.println("The Number is not Prime");
        }
    }
}
