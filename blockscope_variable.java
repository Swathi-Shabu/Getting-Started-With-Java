/* Program to recognise the blockscope of variable */
public class blockscope_variable {
    public static void main (String args[])
    {
        int x = 10; // known throughout the code  
        if(x==10)
        { //new scope begins
            int y = 20; //y is known only to this block
            x = y * 2; // x & y are both known here

        }
        y = 100; // Error because y is unknown here
        System.out.println("x is:" + x);
        System.out.println("y is:"+ y); //Error because y is unknown here as its scope is over
    }
}
