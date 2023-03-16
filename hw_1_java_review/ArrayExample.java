public class ArrayExample
{
    public static void main(String[] args)
    {
        /* 1. Create an String array with 7 slots for storing weekdays. Store
         * each weekday in English. (such as Monday, Tuesday, ..., and Sunday
         */
        String[] weekdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        /* 2. Print out each weekday stored in weekdays one by one. Use any
         * loop statemtns and indexing technique(method) for array. */

         for(int i=0;i<weekdays.length;i++){
             System.out.println(weekdays[i]);
         }

        /* Output example:
           Monday
           Tuesday
           Wednesday
           Thursday
           Friday
           Saturday
           Sunday
         */
    }
}
