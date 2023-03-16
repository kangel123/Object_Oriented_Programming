public class Factorial
{
    public static long factorial(int n)
    {
        if(n<=1){
            return n;
        }
        else{
            return factorial(n-1)*n;
        }
    }

    public static void main(String[] args)
    {
        /* Design a function factorial() such that the following code 
         * prints out the following output:
         */

        System.out.println("10! = " + factorial(10));
        System.out.println("20! = " + factorial(20));

        /* output:
           10! = 3628800
           20! = 2432902008176640000
         */
    }
}
