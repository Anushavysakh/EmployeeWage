package com.Assignment.Bridlabz;

public class uc6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int workingHour = 0;
		int wagePerHour = 20;
		int workingDays = 0;
		int totalWorkingHour = 0;
		int totalWorkdays = 0;
		if (totalWorkdays < 20 && totalWorkingHour < 100) {
			for (int i = 0; i < 20; i++) {
				int attendence = (int) (Math.floor(Math.random() * 10)) % 3;
				switch (attendence) {

				case 0:
					System.out.println("Employee Absent");
					workingHour = 0;
					break;
				case 1:
					System.out.println("Employee Full-Time");
					workingHour = 8;
					workingDays++;
					break;
				default:
					System.out.println("Employee Part-Time");
					workingHour = 4;
					workingDays++;
					break;
				}
				totalWorkingHour += workingHour;
			}
		}
		int totalSalary = totalWorkingHour * wagePerHour;
		System.out.println("Employee totalSalary per month=" + totalSalary);
		System.out.println("Total working days"+workingDays);
		System.out.println("Total working hours = "+totalWorkingHour);
		
	}

}
