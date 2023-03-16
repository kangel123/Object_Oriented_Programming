import java.util.Scanner;

public class MultipleDataProcessingArrayExample
{
    public static double calculateMean(int[] data)
    {
        double mean; 

        /* find mean using for loop */
        int sum = 0;

        for (int s: data)
        {
            sum = sum + s;
        }

        mean = (double)sum / data.length;

        return mean;
    }

    public static int[] getScores(int n)
    {
        int[] userInputs = new int[n];
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < n; ++i)
        {
            System.out.print("Score for student " + (i + 1) + ":");
            userInputs[i] = scan.nextInt();
        }

        return userInputs;
    }


    public static void main(String[] args)
    {
        /* Get score inputs using Scanner */

        Scanner scan = new Scanner(System.in);
        int n = 0;

        System.out.print("How many students?: ");
        n = scan.nextInt();

        int[] scores = getScores(n);

        System.out.println("Mean for scores: " + calculateMean(scores));
    }
}


