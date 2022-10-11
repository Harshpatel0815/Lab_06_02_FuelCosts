import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        double gallons = 0;
        double mpg = 0;
        double price = 0;
        double total = 0;
        double distance = 0;

        System.out.print("How many gallons of gas can fit in your tank? ");
        if(in.hasNextDouble())
        {
            gallons = in.nextDouble();
            in.nextLine();
        }
        else {
            System.out.println("You have entered a bad input");
        }

        System.out.print("How many miles does your car get per gallon? ");
        if(in.hasNextDouble())
        {
            mpg = in.nextDouble();
            in.nextLine();
        }
        else
        {
            System.out.println("You have entered a bad input");
        }

        System.out.print("Enter price of gas per gallon: ");
        if(in.hasNextDouble())
        {
            price = in.nextDouble();
            in.nextLine();
        }
        else
        {
            System.out.println("You have entered a bad input");
        }

        total = (100/mpg)*price;
        System.out.println("Your cost for 100 miles would be: " + total);

        distance = gallons * mpg;
        System.out.println("You have " + distance + " miles left in your car");
    }
}