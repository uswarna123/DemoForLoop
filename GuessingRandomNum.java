import java.util.Random;
import java.util.Scanner;

public class GuessingRandomNum {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Random rNum= new Random();
        int random= rNum.nextInt(10);
        int num;
        int NoOfGusses=0;
        do{
            System.out.println("Enter a number between 0 to 10");
            num=scanner.nextInt();
            if(num < random){
                System.out.println("Too low, Try again");
            } else if (num > random) {
                System.out.println("Too High , Try again");
            }
            else {
                System.out.println("correct in "+NoOfGusses+" guesses");
            }
            NoOfGusses++;
        }while (num!=random);


    }
}
