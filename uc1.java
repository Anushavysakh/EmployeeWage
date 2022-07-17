package com.Assignment.Bridlabz;

public class uc2 {

	public static void main(String[] args) {
	
			int workingHour;
			int wagePerHour=20;
			int attendence= (int) (Math.floor(Math.random()*10))%2;
		
			if(attendence == 1) {
				System.out.println("Employee Present..");
			workingHour=8;
			} else {
				System.out.println("Employee Absent..");
				workingHour=0;
			}
			int Dailywage=wagePerHour*workingHour;
			System.out.println("Daily wage of empoyee= " +Dailywage);
			}

}
