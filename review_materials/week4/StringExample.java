public class StringExample
{
    public static void main(String[] args)
    {
        /* immutable: read-only */
        String s = new String("hello world");
        s = "abcde" + s;
        System.out.println(s);

        System.out.println();

        /* mutable: read-write */
        StringBuilder sb = new StringBuilder("hello world");
        StringBuilder another = sb;

        sb.insert(0, "abcde");

        System.out.println(sb);
        System.out.println(another);
    }
}


