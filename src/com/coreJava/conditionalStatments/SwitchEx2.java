package com.coreJava.conditionalStatments;

public class SwitchEx2 {

	public static void main(String[] args) {
		String day="saturday";
		{
			switch(day) {
			case "monday": System.out.println("1st day of week");
			break;
			case "tuesday": System.out.println("2nd day of week");
			break;
			case "wednesday": System.out.println("3rd day of week");
			break;
			case "thursday": System.out.println("4th day of week");
			break;
			case "friday": System.out.println("5th day of week");
			break;
			case "saturday": System.out.println("6th day of week");
			break;
			case "sunday": System.out.println("7th day of week");
			break;
		}

	}

}
}
