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
                System.out.println("HELLO");
                System.out.println("WELCOME TO TRAPEZOID AREA CALCULATOR");
                System.out.println("ENTRE HEIGHT OF TRAPEZOID");
                h=read.nextDouble();
                if(h>0)
                {
                    System.out.println("ENTRE LENGTH OF FIRST PARALLEL SIDE");
                    b=read.nextDouble();
                    if(b>0)
                    {
                        System.out.println("ENTRE LENGTH OF SECOND PARALLEL SIDE");
                        c=read.nextDouble();
                        if(c>0)
                        {
                            a=h*((b+c)/2);
                            System.out.println("AREA OF TRAPEZOID IS");
                            System.out.println(a);
                            System.out.println("THANKS");
                            System.out.println("BYE");
                            System.out.println(".");
                        }
                        if(c<0)
                        {
                            System.out.println("PARALLEL LINE OF TRAPEZOID CANT BE NEGATIVE");
                            System.out.println("TRY AGAIN");
                            System.out.println(".");
                        }
                    }
                    if (b<0)
                    {
                        System.out.println("PARALLEL LINE OF TRAPEZOID CANT BE NEGATIVE");
                        System.out.println("TRY AGAIN");
                        System.out.println(".");
                    }
                }
                if(h<0)
                {
                    System.out.println("HEIGHT OF TRAPEZOID CANT BE NEGATIVE");
                    System.out.println("TRY AGAIN");
                    System.out.println(".");
                }
            }
        }
    }

}
