import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Activity1 {

    public static void main(String []args) throws Exception
    {
    	Scanner sc = new Scanner(System.in);
    		
    	Date date = new Date();
   		SimpleDateFormat format=new SimpleDateFormat ("dd-MM-yyyy");
   		Calendar calendar = new GregorianCalendar();
   		
   		System.out.println("Enter your Birthday below");
   		String input_bday = sc.nextLine();
   		Date bday = format.parse(input_bday);
   		
   		int year = calendar.get(Calendar.YEAR);
   		calendar.setTime(bday);
   		int byear = calendar.get(Calendar.YEAR);
   		
   		int age = year - byear;
   		System.out.print("My age: " + age);
   		
   		
   		
    }
    
}
