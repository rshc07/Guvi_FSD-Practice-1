public class SmallestNumber {
    public static void main(String[] args)
    {
        int num1 = 5;
        int num2 = 2;
        int num3 = 8;
        int smallestNumber = findSmallestNumber(num1, num2, num3);
        System.out.println("The smallest number is: " + smallestNumber);
    }
    public static int findSmallestNumber(int a, int b, int c) 
    {
        int smallest = a;
        if (b < smallest)
        {
            smallest = b;
        }
        if (c < smallest)
        {
            smallest = c;
        }
        return smallest;
    }
}