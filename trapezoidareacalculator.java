import java.util.Scanner;
public class trapezoidareacalculator
{
    public static void main(String[] args)
    {
        /*a=area
        h=height
        b=length of first parallel side
        c=length of second parallel side */
        double a,b,c,h;
        try (Scanner read = new Scanner(System.in)) {
            while(true)
            {
                System.out.println("Hello");
                System.out.println("Welcome to Trapezoid Area Calculator");
                System.out.println("Entre height of trapezoid");
                h=read.nextDouble();
                if(h>0)
                {
                    System.out.println("Entre length of First Parallel side");
                    b=read.nextDouble();
                    if(b>0)
                    {
                        System.out.println("Entre Length of Second Parallel side");
                        c=read.nextDouble();
                        if(c>0)
                        {
                            a=h*((b+c)/2);
                            System.out.println("Area of Trapezoid is");
                            System.out.println(a);
                            System.out.println("Thank you");
                            System.out.println("Bye");
                            System.out.println(".");
                        }
                        else if(c<=0)
                        {
                            System.out.println("Parallel Line of Trapezoid cant be negative or zero");
                            System.out.println("Try again");
                            System.out.println(".");
                        }
                    }
                    else if (b<=0)
                    {
                        System.out.println("Parallel Line of Trapezoid cant be negative or zero");
                        System.out.println("Try again");
                        System.out.println(".");
                    }
                }
                else if(h<=0)
                {
                    System.out.println("Height of Trapezoid cant be negative or zero");
                    System.out.println("Try again");
                    System.out.println(".");
                }
            }
        }
    }

}


