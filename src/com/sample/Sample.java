package com.sample;

import java.util.Scanner;

public class Sample {
	
	public static void main(String[] args) {
//		Scanner scanner= new Scanner(System.in);
//		System.out.println("What is your name");
//		String name=scanner.nextLine();
//		System.out.println(name);
		
		int a=2,b=3;
		int c=a+b;
		System.out.println(c);
		int d=a++;
		System.out.println(d);
		System.out.println(a>b);
		String f= "alex";
		char g='s';
		
		System.out.println(f+g);
		
				int j=20,k=23;
		int l= ++j - --k;
		System.out.println(l);
		Scanner scanner= new Scanner (System.in);
		String morning=scanner.nextLine();
		System.out.println(morning);
		System.out.println(j);
		Scanner scanner1= new Scanner (System.in);
		System.out.println("Enter a number: ");
		int num = scanner1.nextInt();
		if(num>2) {
			System.out.println(num + "is big number");
			
		}
		else {
			System.out.println(num + "is small number");
			Scanner scanner3= new Scanner (System.in);
			String stella= scanner3.nextLine();
			System.out.println(stella);
			
			
			

	
		}
		

		
		
		
		
		
		
		
		
		
	}

}
