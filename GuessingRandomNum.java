import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class GuessingRandomNum {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a positive integer");
        int num;
        num=scanner.nextInt();
        Random rNum= new Random();
        int random= rNum.nextInt(10);
        int NoOfGuess = 0;
        int TryAgain = 0;

        do {
            if (num < random){
                System.out.println("Too low, Try again");
                System.out.println("Enter another number");
                num= scanner.nextInt();

            }
            else if (num > random) {
            System.out.println("Too High , Try again");
                System.out.println("Enter another number");
                num= scanner.nextInt();
             }
            else
           {
            System.out.println("correct in "+NoOfGuess+" guess " );
            }
            NoOfGuess++;
        } while (random!=num);

    }
}
