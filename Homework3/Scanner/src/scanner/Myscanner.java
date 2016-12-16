package scanner;
import java.util.Scanner;

/**
 * Created by Unaer on 12/13/2016.
 */
public class Myscanner
{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an amoount in double format, for example:12.05:");
        double amount = input.nextDouble();

        int remainingAmount = (int)(amount * 100);
        int dollars = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;
        System.out.println("Remaining Amount is : " +remainingAmount);
        System.out.println("Number of Dollars is"+ dollars);
    }

}

