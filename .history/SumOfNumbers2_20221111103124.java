import java.util.Scanner;
public class SumOfNumbers2
{
    public static void main(String args[])
    {
        int x,y,sum;
        final Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first Number:");
        x = sc.nextInt();
        System.out.print("Enter the second Number:");
        y = sc.nextInt(); 
        sum = x+y;
        System.out.println(sum);  
    }
}
