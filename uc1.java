package com.Assignment.Bridlabz;
//import java.util.Random;
public class uc1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int attendence= (int) (Math.floor(Math.random()*10))%2;
		 System.out.println("Welcome to Employee Wage Computation Program");

		//	Random random= new Random();
		//	int attendance=random.nextInt(2);

			if(attendence == 1)
				System.out.println("Employee Present..");
			else
				System.out.println("Employee Absent..");
	}

}
