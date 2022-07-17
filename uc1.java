package com.Assignment.Bridlabz;

public class uc7 {
	public static final int workingHour = 0;
	public static final int wagePerHour = 20;
	public static int workingDays = 0;
	 
	public int empCheck() {
		int workingHour=0;
		int attendence = (int) (Math.floor(Math.random() * 10)) % 3;
	
		switch (attendence) {
		
			case 0:
					System.out.println("Employee Absent");
					workingHour = 0;
					break;
			case 1:
					System.out.println("Employee Full-Time");
					workingHour = 8;
					break;
			default:
					System.out.println("Employee Part-Time");
					workingHour = 4;
					break;
		}
		return  workingHour;
	}
	public int wageCalculator() {
		int totalWorkingHour=0,totalWorkdays=0,totalWage=0;
		while (totalWorkdays < 20 && totalWorkingHour < 100) {
			totalWorkdays++;
			int workingHour = empCheck();
			int empWage = workingHour * wagePerHour;
            totalWage += empWage;
            System.out.println("Employee Wage for day "+ totalWorkdays + " is " + empWage);
            totalWorkingHour += workingHour;
		}
		return totalWage;
	}
	
	public static void main(String[] args) {
		uc7 obj = new uc7();
		int totalWage = obj.wageCalculator();
		System.out.println("Total Employee Wage - " + totalWage);
	}

}
