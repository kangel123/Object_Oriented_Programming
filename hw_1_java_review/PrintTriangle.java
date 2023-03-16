public class PrintTriangle
{
    public static void main(String[] args)
    {
        /* Print out the following triangular shape
         * using any loop statments.
         */
       
        for(int i=0;i<12;i++)
        {
            for(int j=0;j<12;j++)
            {
                if(i+j>=11){
                    System.out.print("#");
                } 
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        /*
                      #
                     ## 
                    ###
                   ####
                  #####
                 ######
                #######
               ########
              #########
             ##########
            ###########
           ############
         */
    }
}
