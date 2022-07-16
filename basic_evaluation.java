
/*Program that outputs the result of the following evaluation based on the number entered by the user
 1. Natural Logarithm 2.Square Root 3.Absolute Value 4.Random Number*/
 
import java.io.*;
public class basic_evaluation {
    public static void main (String args[]) throws NumberFormatException, IOException
    {
        double n;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader stdin = new BufferedReader(isr);
        System.out.println("Enter the number:"); 
        n = Double.parseDouble(stdin.readLine());
        System.out.println("Natural Logarithm of the number:" + Math.log(n));
        System.out.println("Square root of the number:" + Math.sqrt(n));
        System.out.println("Absolute value of the number:" + Math.abs(n));
        System.out.println("Random number:" + Math.random());

    }
    
}
