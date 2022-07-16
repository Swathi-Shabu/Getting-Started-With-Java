/*Program that initializes three variables namely hoursWorked,payRate & taxRate and then calculates 
and prints payment amount and Tax payable as hoursWorked * payRate 
and Payment amount * taxRate respectively*/

public class variables {
    public static void main(String[] args)
    {
        long hoursWorked = 100;
        double payRate = 50.0;
        double taxRate = 16.80;
        final double payableAmount = hoursWorked * payRate;
        double taxPayable = payableAmount * taxRate;
        System.out.println("Hours Worked:" + hoursWorked);
        System.out.println("Payment Amount:" + payableAmount);
        System.out.println("Tax Payable:"+taxPayable);

        
    }
}
