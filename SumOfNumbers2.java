import java.util.Scanner;
public class SumOfNumbers2
{
    public static void main(String args[])
    {
        int x,y,sum;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the 1st Number:");
            x = sc.nextInt();
            System.out.print("Enter the 2nd Number:");
            y = sc.nextInt();
        }
        sum = x+y;
        System.out.println(sum);  
    }
}
