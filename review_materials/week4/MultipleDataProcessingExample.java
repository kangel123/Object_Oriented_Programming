public class MultipleDataProcessingExample
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

    public static void main(String[] args)
    {
        int[] scores = {80, 90, 86, 92, 91, 88};

        System.out.println("Mean for scores: " + calculateMean(scores));
    }
}



