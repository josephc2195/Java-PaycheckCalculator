/**
 * This class is for most of the work in the program. it sets all the fields and variables 
 * to whatever their amount needs to be, and calculates what it needs to, so it can find the 
 * final pay
 * 
 * @author (Joseph Chica) 
 * @version (09/12/16)
 */
public class PayCheck
{
    private double hourlyRate;
    private double hoursWorked;
    private double grossPay;
    private double federalTax;
    private double stateTax;
    private double FICAAmount;
    private double netPay;
    private String lastName;
    private String firstName;
    private final double FEDERAL_TAX_RATE;
    private final double STATE_TAX_RATE;
    private final double FICA_RATE;
    

    /**
     * The default constructor method. In this we set all fields to 0, and all Strings to unknown.
     */
    public PayCheck()
    {
        hourlyRate = 0;
        hoursWorked = 0;
        grossPay = 0;
        federalTax = 0;
        stateTax = 0;
        FICAAmount = 0;
        netPay = 0;
        lastName = "unknown";
        firstName = "unknown";
        FEDERAL_TAX_RATE = .15;
        STATE_TAX_RATE = .09;
        FICA_RATE = .07;
        
    }

    /**
     * This overloaded constructor uses values of parameters, to set all of the 
     * initial values of the fields
     *  
     *  @param
     *  @param
     *  @param
     *  @param
     *  @param
     *  @param
     *  @param
     *  @param
     *  @param
     *  @param
     *  @param
     */
    public void sampleMethod(int inHourlyRate, int inHoursWorked, int inGrossPay, int inFederalTax, int inNetPay, int inStateTax, int inFICAAmount, String inLastName, String inFirstName)
    {
        hourlyRate = inHourlyRate;
        hoursWorked = inHoursWorked;
        grossPay = inGrossPay;
        federalTax = inFederalTax;
        stateTax = inStateTax;
        FICAAmount = inFICAAmount;
        lastName = inLastName;
        firstName = inFirstName;
        netPay = inNetPay;
    }
    
    /**
     * This get method is used to return the lastName field
     * 
     * @return String lastName
     */
    public String getLastName()
    {
        return lastName;
    }
    
    /**
     * This set method is used to change the data we receive from the driver to this class
     * 
     * @param String lName
     */
    public void setLastName(String lName)
    {
        lastName = lName;
    }
    
    /**
     * This get method is used to return the firstName field
     * 
     * @return
     */
    public String getFirstName()
    {
        return firstName;
    }
    
    /**
     * This set method is used to change the data we receive in the driver to this class
     * 
     * @param String fName
     */
    public void setFirstName(String fName)
    {
        firstName = fName;
    }
    
    /**
     * This get method is used to return the users hourly rate
     * 
     * @return
     */
    public double getHourlyRate()
    {
        return hourlyRate;
    }
    
    /**
     * This set method is used to change the data in the hourly rate field from the driver
     * to this class
     * We also do data validation using an if/else statement
     * 
     * @param 
     */
    public void setHourlyRate(double payRate)
    {
        if(payRate < 5 || payRate > 100)
        hourlyRate = 0;
        else
        hourlyRate = payRate;
    }
    
    /**
     * This get method is used to return hours worked
     * 
     * @return
     */
    public double getHoursWorked()
    {
        return hoursWorked;
    }
    
    /**
     * this set method is used to change the number of hours worked in 
     * this class from the driver
     * 
     * there is also data validation for anything below 0 or above 80
     * 
     * @param double hours
     */
    public void setHoursWorked(double hours)
    {
        if(hours < 0 || hours > 80)
        hoursWorked = -1;
        else 
        hoursWorked = hours;
        
    }
    
    /**
     * This get method was used to return the gross pay and 
     * then sent into the toString method. it is calculated by multiplying 
     * the hours worked and the hourly rate
     * 
     * @return
     */
    public double getGrossPay()
    {
        grossPay = hoursWorked * hourlyRate;
        return grossPay;
    }
    
    /**
     * this get method is used to return the federal tax
     * It is calculated by multiplying the gross pay by the federal tax rate
     * 
     * @return
     */
    public double getFederalTax()
    {
        federalTax = FEDERAL_TAX_RATE * grossPay;
        return federalTax;
    }
    
    
    /**
     * this get method is used to return the State tax
     * It is calculated by multiplying the gross pay by the state tax rate
     * 
     * @return
     */
    public double getStateTax()
    {
        stateTax = STATE_TAX_RATE * grossPay;
        return stateTax;
    }
    
    /**
     * this get method is used to return the federal tax
     * It is calculated by multiplying the gross pay by the FICA rate which is a constant
     * set at the begining of the program
     * 
     * @return
     */
    public double getFICAAmount()
    {
        FICAAmount = FICA_RATE * grossPay;
        return FICAAmount;
    }
    
    /**
     * This get method is how we calculate the final net pay of the user
     * We get the gross pay and subtract the federal tax amount, state tax amount
     * and FICA amount
     * we then return it to the driver
     * 
     * @return
     */
    public double getNetPay()
    {
        netPay = (grossPay - federalTax - stateTax - FICAAmount);
        return netPay;
    }
    
    /**
     * in the toString method we set up what we want to say at the end of the program
     * 
     * @return
     */
    public String toString()
    {
        return lastName + ", " + firstName + ": \nGross pay: " + grossPay + "\nFederal Tax: " 
        + federalTax + "\nState Tax: " + stateTax + "  \nFICA: " + FICAAmount + "\nNet Pay: " + netPay;
    }
}
