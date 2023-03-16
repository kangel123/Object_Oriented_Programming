import java.util.Scanner;/* put proper import statemtents here */
import java.util.ArrayList;

public class FunctionAbstractionExample
{
    public static double calculateMean(ArrayList<Integer> data)
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

    public static ArrayList getScoresUntilDone()
    {
        ArrayList<Integer> scores = new ArrayList<Integer>();
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

        return scores;
         
    }

    public static void main(String[] args)
    {
        ArrayList<Integer> scores = getScoresUntilDone();
        System.out.println("Mean for scores: " + calculateMean(scores));
    }
}