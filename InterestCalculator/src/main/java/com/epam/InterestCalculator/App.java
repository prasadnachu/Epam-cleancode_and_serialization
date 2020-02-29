package com.epam.InterestCalculator;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;
/**
 * Hello world!
 *
 */
public class App
{
	private static PrintStream myprint;
	private static Scanner sc;
	public static void getInterest() {
		myprint =  new PrintStream(new FileOutputStream(FileDescriptor.out));
		myprint.print("Enter Principal Amount :");
		double pa=sc.nextDouble();
		myprint.print("Enter Time Period in years :");
		double ti= sc.nextDouble();
		myprint.print("Enter Rate of Interest :");
		double rate=sc.nextDouble();
		Interest i=new Interest(pa,ti,rate);
		myprint.print("\noption 1- Calculate Simple Interest\nOption 2- Calculate Compound Interest\nEnter option ");
		int  op=sc.nextInt();
		if(op==1) {
			myprint.print("Simple Interest is "+i.getSimpleInterest());
		}
		else {
			myprint.print("Compound Interest is "+i.getCompoundInterest());
		}
	}
	public static void getCostOfBuliding() {
		myprint =  new PrintStream(new FileOutputStream(FileDescriptor.out));
		myprint.print("• Option 1-standard materials\n• Option 2-use above standard materials\n• Option 3-high standard material\n• Option 4-high standard material and fully automated home\n Enter the type material requried for type of constuction of buliding ");
		int op2=sc.nextInt();
		myprint.print("Enter the area of the land to estimate the cost of buliding ");
		double area=sc.nextDouble();
		Building b=new Building(area,op2);
		myprint.print("Cost for construction of buliding is "+b.getCostOfBuilding());
	}
    public static void main( String[] args )
    {
	    myprint =  new PrintStream(new FileOutputStream(FileDescriptor.out));
    	sc =new Scanner(System.in);
        while(true) {
        	myprint.print("\n1 to claculate Interest\n2 to calculate the cost for buliding a buliding\n3 to exit\n");
        	myprint.print("Enter option ");
        	int option = sc.nextInt();
        	switch(option) {
        	case 1:
        		getInterest();
        		break;
        	case 2:
        		getCostOfBuliding();
        		break;
        	case 3:
        		sc.close();
        		return;
        	default:
        		error();
        	}
        }
        
    }
	private static void error() {
		myprint.print("Enter valid opion");
			myprint.close();
	}
}
