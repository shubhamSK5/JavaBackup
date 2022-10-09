package com.coreJava.conditionalStatments;

public class ElseIfEx2 {

	public static void main(String[] args) {
		int marks=85;
		
		if(marks<50)
		{
			System.out.println("you are failed");
		}
		else if (marks>=50 && marks<60)
		{
			System.out.println("you are passed with Grade 'D'");
		}
		else if (marks>60 && marks<70)
		{
			System.out.println("you are passed with grade 'C'");
		}
		else if (marks>70 && marks<80)
		{
			System.out.println("you are passed with grade 'B'");
		}
		else if (marks>80 && marks<90)
		{
			System.out.println("you are passed with grade 'A'");
		}
		else if (marks>90 && marks<100)
		{
			System.out.println("you are passed with grade 'A+'");
		}

	}

}
