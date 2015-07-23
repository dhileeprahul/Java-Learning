package com.bluemapletech.Rahul;

import java.util.Scanner;


public class Shop {	Scanner in = new Scanner(System.in);
int a;
Category add = new Category();

public void disp() {
	do {
		System.out.println("1. Category");
		System.out.println("2.Add product");
		System.out.println("3. shopping");
		System.out.println("4.List the order");
		System.out.println("5.Exit");
		System.out.println("Enter your choice:");
		a = in.nextInt();
		switch (a) {
		case 1:
			
			System.out.println("1. Category");
			add.cat();
			break;
		case 2:
			System.out.println("2.Add product");
			add.pro();
			break;
		case 3:
			System.out.println("3. shopping");
			add.shop();
			break;
		case 4:
			System.out.println("4.List the order");
			add.list();
			break;
		case 5:
			
			break;
		}
	} while (a <5);

}

}




	
	
