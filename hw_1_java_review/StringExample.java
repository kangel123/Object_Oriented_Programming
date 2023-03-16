public class StringExample
{
    public static void main(String[] args)
    {
        /* 1. Concatenate the following two String variables and print out
         * "Hello there.I feel good." Use concatenation operator for String.
         */
        StringBuffer sb = new StringBuffer();
        String firstMessage = "Hello there.";
        String secondMessage = "I feel good.";

        System.out.println("1.");
        sb.append(firstMessage);
        sb.append(secondMessage);
        String result = sb.toString();
        System.out.println(result);
        System.out.println();
        /* 2. Convert the following message into upperclass and prints out the
         * result.
         */ 
        System.out.println("2.");
        String messageForConversion = "The quick brown fox jumps over the lazy dog.";
        System.out.println(messageForConversion.toUpperCase());
        System.out.println();
       

        /* 3. Use split() method in String and split the sentence into words.
         * Then print out each word as follows. Need to use array and any loop
         * statements.
         */
        System.out.println("3.");
        String sentence = "Conditions worsen in Ukraine as war enters 3rd week.";
        String[] a = sentence.split(" ");
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }

      
        /* Example:
           Conditions
           worsen
           in
           Ukraine
           as
           war
           enters
           3rd
           week.
        */         
    }
}
