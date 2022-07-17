package com.Assignment.Bridlabz;

public class uc3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int workingHour;
		int wagePerHour=20;
		int attendence= (int) (Math.floor(Math.random()*10))%3;
	
		if(attendence == 0) {
			System.out.println("Employee Absent..");
		workingHour=0;
		} else
		if(attendence==1){
			System.out.println("Employee Present and full-time employee");
			workingHour=8;
		}else {
			System.out.println("Employee Present and part-time employee");
			workingHour=4;
		}
		int Dailywage=wagePerHour*workingHour;
		System.out.println("Daily wage of empoyee= " +Dailywage);
		}
	
	}


