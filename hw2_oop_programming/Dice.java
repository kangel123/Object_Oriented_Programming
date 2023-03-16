import java.util.Scanner;
import java.util.Random;

public class Dice
{
    public static int singleCubeRoll()
    {
        int number = (int)(Math.random() * 6) + 1;      

        return number;
    }

    public static int[] multipleRolls(int n)/* multipleRolls() function header */
    {
        int[] num= new int[n];
        for(int i=0;i<n;i++){
            num[i] = singleCubeRoll();
        }
        return num;
    }

    public static void main(String[] args)
    {
        System.out.println("A dice roll: " + singleCubeRoll());

        /* Q: Design a function multipleRolls(n) such that
         * multipleRolls(n) returns dice numbers for
         * rolling n times. The function design must make the
         * code below generate the following output. (Random number 
         * outputs might differ.)
         */

        System.out.print("How many times do you want to roll a dice?: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        /* type? */int[] diceNumbers = new int[n];/* function call for multipleRolls()? */
        
        diceNumbers=multipleRolls(n);

        System.out.println("### Dice numbers:");
        for (int number: diceNumbers)
        {
            System.out.println(number);
        }

        /* Output:
         * 
           How many times do you want to roll a dice?: 5
           3
           4
           1
           1
           6
         */
    }
}
