import java.util.ArrayList;
import java.util.Scanner;
/* put proper import statemtents here */

public class MultipleDataProcessingListExample
{
    public static double calculateMean(ArrayList<Integer> data)/* define calculateMean() method here and below */
    {
        double mean; 

        int sum= 0;

        for(Integer s : data)
        {
            sum=sum+s.intValue();
        }

        mean=(double)sum/data.size();

        return mean;
    }

    public static void main(String[] args)
    {
        ArrayList<Integer> scores = new ArrayList<Integer>();

        /* Get score inputs using Scanner */
        Scanner scan = new Scanner(System.in);
        int userInput = 0;
        Integer integerObject = null;

        while(userInput!=-1)
        {
            System.out.println("Enter a score (enter -1 to quit): ");
            userInput=scan.nextInt();
            integerObject = userInput;
            scores.add(integerObject);
        }
        scores.remove(scores.size()-1);

        /* Write code lines that (1) get score inputs from the keyboard
         * (2) keep receiving inputs until the user enters -1. The inputs
         * must be stored in scores ArrayList variable defined up. When the
         * scores variable is ready with all the inputs, pass it to
         * calculateMean() method to calculate the mean. Use while or do-while
         * statement for the input looping.
         *
         * NOTE: Do not forget to eliminate -1 entry in the scores list 
         * before passing it to calculateMean() method
         */

        System.out.println("Mean for scores: " + calculateMean(scores));
    }
}


