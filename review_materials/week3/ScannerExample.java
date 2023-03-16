import java.util.Scanner;

public class ScannerExample
{
    public static void main(String[] args)
    {
        int n = 0;
        double n2 = 0.0;
        String word = null;
        String sentence = null;

        Scanner scan = null;
        scan = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        n = scan.nextInt();

        System.out.print("Enter a real number: ");
        n2 = scan.nextDouble();

        System.out.print("Enter a word: ");
        word = scan.next();
        scan.next();

        System.out.print("Enter a line: ");
        sentence = scan.nextLine();


        System.out.println("You entered: " + n);
        System.out.println("You entered: " + n2);
        System.out.println("You entered: " + word);
        System.out.println("You entered: " + sentence);

    }
}
