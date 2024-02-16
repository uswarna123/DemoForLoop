
import java.util.Random;
import java.util.Scanner;

public class GuessingRandomNum {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Random rNum= new Random();
        int random= rNum.nextInt(10);
        int num;
        int NoOfGuess=0;

        do {
            System.out.println("Enter number between 0 to 10");
            num= scanner.nextInt();
            if (num < random){
                System.out.println("Too low, Try again");
            }
            else if (num > random) {
            System.out.println("Too High , Try again");
             }
            else
           {
            System.out.println("correct in "+NoOfGuess+" guess " );
            }
            NoOfGuess++;
        } while (random!=num);

    }
}
