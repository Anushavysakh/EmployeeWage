package com.Assignment.Bridlabz;

public class uc5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int workingHour;
		int wagePerHour=20;
		int workingDays=20;
			int attendence= (int) (Math.floor(Math.random()*10))%3;
			switch(attendence) {
		
			case 0:
					System.out.println("Employee Absent");
					workingHour=0;
					break;
			case 1:
					System.out.println("Employee Full-Time");
					workingHour=8;
					break;
			default:
					System.out.println("Employee Part-Time");
					workingHour=4;
					break;
			}
		int Dailywage= wagePerHour*workingHour;
		System.out.println("Daily wage of empoyee= " +Dailywage);
		int Salary=Dailywage*workingDays;
		System.out.println("Salary for 20 days= "+Salary);
		}
	}


