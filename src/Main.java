public class Main {
    public static void main(String[] args)
    {
        int numInQuestion = 85;
        {
            if (numInQuestion % 2 == 0)
                System.out.println(numInQuestion + " is even.");
            else // must be odd
                System.out.println(numInQuestion + " is odd");
        }
    }
}