package employee;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeUC 
{

	static int pr=0;
	static int ab=0;
	static int prt_time_days;
	static int days;
	static String name;
	final static int rate =20;
	final static int emphrs = 8;
	final static int part_time  = 4;
	final static int num_of_working_days = 2;
	private static final int Fixed_hrs = 0;
	static int totalwage=0;
	static int part_time_days1=0;
	static String name1;
	static int ra, days1, count, Pr_wage1, Part_wage1, Ab_wage1;
	static Scanner sc = new Scanner(System.in);
	public static void EmployeeUC() 
	{
		
        Scanner sc=new Scanner(System.in);
	    System.out.print("Enter the employee name :");  
	    name=sc.next(); 
	    System.out.print("Enter the days :");  
	    days=sc.nextInt();
	    
		System.out.println("The Employee name is : " + name);

		for (int i = 0; i <= days; i++) {
			double rand = Math.floor(Math.random() * 10 % 2);
			if (rand == 1) 
			{
				pr++;
			} else if (rand == 0) 
			{
				ab++;
			} else {
				break;
			}
		}
		System.out.println("Employee is present days for " + pr);
		System.out.println("Employee is abscent days for " + ab);
	}
	
	public static void Empcalwage() 
	{
		EmployeeUC();
		int Prwage = rate * emphrs * pr;
		int Abwage = rate * emphrs * ab; 
		System.out.println("The present empcalwage amount is :  "+Prwage);
		System.out.println("The absent empcalwage amount is :  "+Abwage);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empcalwage();
		
	}
}
