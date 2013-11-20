/*
 * Name: Jake Robert M. Pasculado
 * Title: Time Greeter
 * Description: Greeting time for a user.
 * Date: 9/16/2013 Time: 9:56am
 */
import java.util.*;
public class GreetYourJakePasculado {

	/**
	 * @param args
	 */
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Variables
		int seconds;
		int minutes;
		int hours;
		int days;
		int months;
		int years;
		
		//Call Date time
		Date date = new Date ();
		seconds = date.getSeconds();
		minutes = date.getMinutes();
		hours = date.getHours();
		days = date.getDate();
		months = date.getHours();
		years = date.getHours();
		
		//Display Date
		System.out.print("The time is ");	
		System.out.print(hours+":"+ minutes+":"+seconds+"\n");	
		System.out.print("The Date is ");	
		System.out.print(date+"\n");	

		
		//Logic for Time Greet
		if (hours >= 0 && hours <= 11 && minutes <= 59)
			System.out.print("GOOD MORNING");
		else if (hours >= 12 && hours <= 17 && minutes <= 59)
			System.out.print("GOOD AFTERNOON");
		else if (hours >= 18 && minutes <= 59)
			System.out.print("GOOD EVENING");
		
	}
}
