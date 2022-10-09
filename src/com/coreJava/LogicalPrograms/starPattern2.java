package com.coreJava.LogicalPrograms;
//*
//**
//***
//****
//*****
//******
//*******
//row=7, count=6;
public class starPattern2 
{
public static void main(String[] args) 
{
 for(int row=1; row<=7; row++)
 {
     for(int star=1; star<=row; star++)
     {
	 System.out.print("*");
     }
     System.out.println();
 }
}
}
