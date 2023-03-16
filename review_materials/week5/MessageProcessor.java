public class MessageProcessor 
{
    /* attributes: */
    /* Instance variables */
    private String storage;

    /* methods: */
    /* Constructor */
    public MessageProcessor(String initMessage)
    {
        storage = initMessage;        
    }

    public void printLine()
    {
        System.out.println(storage);
    }

    public void verticalPrint()
    {
        for (char c: storage.toCharArray())
        {
            System.out.println(c);
        }
    }

    /* getters and setters */

    public String getMessage()
    {
        return storage;
    }

    public void setMessage(String updateMessage)
    {
        storage = updateMessage;
    }

    public static void main(String[] args)
    {
        /* Instance one */
        /* Instantiation */
        MessageProcessor m = new MessageProcessor("Hello, World!");

        //m.printLine();
        //m.verticalPrint();

        m.setMessage("Abcdefghijkl");
        System.out.println(m.getMessage());

        /* Instance two */
        MessageProcessor hangulMessage = new MessageProcessor("안녕!");
        //hangulMessage.verticalPrint();

    }
}       // end of class declaration
