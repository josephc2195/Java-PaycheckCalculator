import java.util.Scanner;
import java.io.*;
/**
 * Write a description of class Driver here.
 * 
 * @author (Joseph Chica) 
 * @version (09/12/2016)
 */
public class Driver
{
    public static void main(String [] args)
    {
        String lastName;
        String firstName;
        double hourlyRate;
        double hoursWorked;
        double grossPay;
        double federalTax;
        double StateTax;
        double FICAAmount;
        double netPay;
        char again;
        
        //The beginning of my loop
        do{
        again = 'y';
        Scanner input = new Scanner(System.in);
        //creating an object
        PayCheck pay = new PayCheck();
        
        System.out.print(" Enter your last name: ");
        lastName = input.next();//entering the last name into the field
        
        System.out.print(" Enter your first name: ");
        firstName = input.next();
        
        System.out.print(" What is your hourly wage? ");
        hourlyRate = input.nextDouble();
        
        System.out.print(" How many hours did you work? ");
        hoursWorked = input.nextDouble();
        
        //setting all the fields to the pay object
        pay.setLastName(lastName);
        pay.setFirstName(firstName);
        pay.setHourlyRate(hourlyRate);
        pay.setHoursWorked(hoursWorked);
        pay.getGrossPay();
        pay.getFederalTax();
        pay.getStateTax();
        pay.getFICAAmount();
        pay.getNetPay();
        
        System.out.print(pay.toString());
        //printing out all the requirements
        System.out.print("\n Would you like to run this program again? (y/n) ");
        again = input.next().charAt(0);
            
        }while(again == 'y');
        
    }

    
}
