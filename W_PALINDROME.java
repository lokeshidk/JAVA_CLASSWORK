import java.util.Scanner;
public class W_PALINDROME {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter a number");
        int number= input.nextInt();
        int num = number;
        int reversed=0;
        while(num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num = num/10;
        }
        System.out.println(reversed);
        if (number==reversed){
            System.out.println("The number "+number+" is a palendrome.");
        }
        else{
            System.out.println("The number is not a palendrome");
        }
    }
}
