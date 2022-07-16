/* Program to find ASCII values of characters 'a''A''Z''z' */

public class ascii {
    public static void main (String args[])
    {
        char chA = 'A', chZ = 'Z', cha = 'a', chz = 'z';
        int ascA = (int) chA;
        int ascZ = (int) chZ;
        int asca = (int) cha;
        int ascz = (int) chz;

        System.out.println("ASCII value of A is:" + ascA);
        System.out.println("ASCII value of Z is:" + ascZ);
        System.out.println("ASCII value of a is:" + asca);
        System.out.println("ASCII value of z is:" + ascz);

    }
}
