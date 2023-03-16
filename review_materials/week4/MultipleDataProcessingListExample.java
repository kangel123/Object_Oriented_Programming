import java.util.*;

public class MultipleDataProcessingListExample
{
    public static double calculateMean(ArrayList<Integer> data)
    {
        double mean; 

        /* find mean using for loop */
        int sum = 0;

        for (Integer s: data)
        {
            //sum = sum + s.intValue();
            sum = sum + s;      // operator overloading 
        }

        mean = (double)sum / data.size();

        return mean;
    }

    public static void main(String[] args)
    {
        ArrayList<Integer> scores = new ArrayList<Integer>();

        /* Get score inputs using Scanner */
        Scanner scan = new Scanner(System.in);
        int userInput = 0;
        Integer integerObject = null;

        while (userInput != -1)
        {
            System.out.print("Enter a score (enter -1 to quit): ");
            userInput = scan.nextInt();
            integerObject = userInput;

            /* Store userInput into scores list */
            scores.add(integerObject);
        }

        /* removes the last element (-1) */
        scores.remove(scores.size() - 1);

        System.out.println("Mean for scores: " + calculateMean(scores));
    }
}


