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
        if(num==random){
            System.out.println("correct guess");
        } else if (num>random) {
            System.out.println("Too High , Try again");
        }
        else {
            System.out.println("Too low, Try again");
        }

    }
}
