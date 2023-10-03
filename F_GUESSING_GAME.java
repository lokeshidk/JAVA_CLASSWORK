import java.util.Scanner;
import java.util.Random;
public class F_GUESSING_GAME {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand  = new Random ();
        int Real_no = rand.nextInt(10);
        System.out.println("Welcome to guessing game");
        System.out.println("Guess a number from 1-10");
        for (int i = 1; i <= 1000000; i++) {
            System.out.println("Guess The Number.");
            int Guess = input.nextInt();
            if (Real_no == Guess) {
                System.out.println(Guess+" IS CORRECT");
                break;
            }
            else{
                System.out.println("Try Again");
                System.out.println("if you want to quit type 'quit' . if you want to continue type 'C'");
                String leave = input.next();
                if (leave.equals("quit") || leave.equals("Quit")){
                    break;
                }

            }

        }
    }
}
