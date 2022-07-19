package com.Assignment.Bridlabz;

public class uc8 {
	/*public static final int workingHour = 0;
	public final int wagePerHour = 20;
	public static int workingDays = 0;*/
	//private final String company;
	private final int noWorkingDays;
	public final int wagePerHour;
	private final int maxHrsPerMonth;
	private String companyName;
 
	
 uc8(String companyName, int wagePerHour, int noWorkingDays, int maxHrsPerMonth) {
	 this.companyName=companyName;
	 this.wagePerHour=wagePerHour;
	 this.noWorkingDays=noWorkingDays;
	 this.maxHrsPerMonth=maxHrsPerMonth;
	}
	public int empCheck() {
		int workingHour = 0;
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
		return workingHour;
	}

	public void wageCalculator() {
		int totalWorkingHour = 0, totalWorkdays = 0, totalWage = 0;
		while (totalWorkdays < 20 && totalWorkingHour < maxHrsPerMonth) {
			totalWorkdays++;
			int workingHour = empCheck();
			int empWage = workingHour * wagePerHour;
			totalWage += empWage;
			System.out.println("Employee Wage for day " + totalWorkdays + " is " + empWage);
			totalWorkingHour += workingHour;
		}
		System.out.println("The wage by the company "+companyName +" is " +totalWage);
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		uc8 company1 = new uc8("Amazon", 83, 20, 100);
		company1.wageCalculator();
		
		uc8 company2 = new uc8("Wipro", 20, 20, 100);
		company2.wageCalculator();
	}

}
