package com.bluemapletech.Rahul;

import java.util.Scanner;


public class Registration {
	String un[] = new String[100];
	String ep[] = new String[100];
	String dob[] = new String[100];
	String add[] = new String[100];
	String mi[] = new String[100];
	int mob[] = new int[100];
	int n = 0, i;
	String u, p;
	
	Scanner in = new Scanner(System.in);

	
	public void Register()
	{
		System.out.println("Enter user Name:");
		un[n] = in.next();
		System.out.println("Enter password:");
		ep[n] = in.next();
		System.out.println("Enter Your DateofBirth");
		dob[n] = in.next();
		System.out.println("Enter Your Address:");
		add[n] = in.next();
		System.out.println("Enter Your Mailid:");
		mi[n] = in.next();
		System.out.println("Enter Your MobileNo:");
		mob[n] = in.nextInt();
     	n++;
//		Registration a=new Registration();
//		a.Login();
	}
	public void Login()
	{
		System.out.println("Enter User Name:");
		u = in.next();
		System.out.println("Enter password:");
		p = in.next();
		for (i = 0; i < n; i++)
		{
			if ((u.equals(un[i])) && (p.equals(ep[i])))
			{
               Shop s=new Shop();
               s.disp();
}
			else
			{
				System.out.println("Username or password wrong");
			}
		}
}
	
}
