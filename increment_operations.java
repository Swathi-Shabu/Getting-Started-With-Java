/* program that performs prefix and postfix increment operations on a variable having  initial value 2 */

public class increment_operations
{
    public static void main(String args[]) 
    {
        int a = 2, b = 2;
        int c = 2, d = 2;
        int p = a++;
        int q = ++b;
        int r = c--;
        int s = --d;

        System.out.println("a=" + a + "p=" + p);
        System.out.println("b=" + b + "q=" + q);
        System.out.println("c=" + c + "r=" + r);
        System.out.println("d=" + d + "p=" + s);
        
    }
 }