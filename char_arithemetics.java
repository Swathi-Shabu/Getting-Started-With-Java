public class char_arithemetics {
    public static void main (String args[])
    {
        char letter1 = 'A';
        char letter2 = (char) (letter1 + 1);
        char letter3 = letter2;

        System.out.println("Sequence of letters:" + letter1 + letter2 + (++letter3));
        System.out.println("Decimal codes:\n"+ letter1 +":"+(int)letter1+("\n")+ letter2 +":"+(int)(letter2)+("\n")+ (letter3)+":"+(int)(letter3)+("\n"));
    }
}
