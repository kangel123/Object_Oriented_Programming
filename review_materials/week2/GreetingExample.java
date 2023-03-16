public class GreetingExample
{
    public static String generateGreeting(String name)
    {
        String greetingMessage = "Hello, " + name;

        return greetingMessage;
    }

    public static void main(String[] args)
    {
        System.out.println(generateGreeting("Jung-woo"));
        System.out.println(generateGreeting("Elsa"));
        System.out.println(generateGreeting("Olaf"));
    }
}

// Design decision
