package com.logicdrop.wordsmith;

import java.util.Scanner;

public class WordSmithBusinessMain {

	public static void main(String[] args) {
		int number=1;
		while(true){			
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any integer number to see result or 0 for exit");
		try{
			number=sc.nextInt();}
		catch(Exception e){
			System.out.println("please enter integer value (whole numbers)");
			e.printStackTrace();}
		WordSmithBusiness ws=new WordSmithBusiness();
			if(number==0)
			System.exit(0);
			String result=ws.checkForResult(number);
			System.out.println("The result is: "+result);		
		}
	}
}
