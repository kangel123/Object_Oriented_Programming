import java.util.ArrayList;

public class ListExample
{
    public static void main(String[] args)
    {
        /* 1. Create an empty ArrayList of weekdays using new operator */
        ArrayList weekdays = new ArrayList();

        /* 2. add all weekdays from Monday to Sunday into weekdays using add()
         * method.
         */

        weekdays.add("Monday");
        weekdays.add("Tuesday");
        weekdays.add("Wednesday");
        weekdays.add("Thursday");
        weekdays.add("Friday");
        weekdays.add("Saturday");
        weekdays.add("Sunday");

        /* 3. Print out each weekday stored in weekdays one by one. Use any
         * loop statemtns and indexing technique(method) for ArrayList. */
        
        for(int i=0 ; i < 7 ; i++){
          System.out.println(weekdays.get(i));
        }
        System.out.println();
        /* Output example:
           Monday
           Tuesday
           Wednesday
           Thursday
           Friday
           Saturday
           Sunday
         */

        weekdays.remove(2);
        for(int i=0;i<6 ;i++){
          System.out.println(weekdays.get(i));
        }

        /* 4. Take out Wednesday off the list stored in weekdays. Print out
         * each weekday as we did above. */

      

        /* Output example:
           Monday
           Tuesday
           Thursday
           Friday
           Saturday
           Sunday
        */
      
    }
}
