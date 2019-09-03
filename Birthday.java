/**
 * @(#)Birthday.java
 *
 *
 * @author 
 * @version 1.00 2019/9/3
 */


import java.util.Date;
import java.util.Scanner;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;

public class Birthday 
{

    public static void main(String []args) throws Exception
    {
    	Scanner sc = new Scanner(System.in);
    	
    	SimpleDateFormat format=new SimpleDateFormat("dd-M-yyyy");
    	
    	System.out.print("input Date: ");
    	String input_date = sc.nextLine();
    	Date date = format.parse(input_date);
    	
    	System.out.println(date);
    	
    	Calendar calendar = new GregorianCalendar();
    	
    	String input_bday = "13-11-2000";
    	Date bday = format.parse(input_bday);
    	
    	int year = calendar.get(Calendar.YEAR);
    	calendar.setTime(bday);
    	int byear = calendar.get(Calendar.YEAR);
    	
    	int age = year - byear;
    	System.out.print("My age " +age);
    }
    
    
}