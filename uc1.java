package com.Assignment.Bridlabz;

public class uc4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int attendence= (int) (Math.floor(Math.random()*10))%3;
		switch(attendence) {
			case 0:
					System.out.println("Employee Absent");
					break;
			case 1:
					System.out.println("Employee Full-Time");
					break;
			default:
					System.out.println("Employee Part-Time");
					break;
			}
	}

}
