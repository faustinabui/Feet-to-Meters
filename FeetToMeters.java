import java.util.Scanner;
public class FeetToMeters
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        //Input
        System.out.print("Enter feet as an integer: ");
        int feet = in.nextInt();
        //Processing
        final double METERS_PER_FOOT = 0.305;
        double meters = feet * METERS_PER_FOOT;
        //Output
        System.out.println(feet + " feet is " + meters + "  meters");
    }
}