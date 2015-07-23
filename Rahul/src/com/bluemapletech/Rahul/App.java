package com.bluemapletech.Rahul;

import java.util.Scanner;

public class App {

	public static void main(String[] arg)
    	{
        int a;
    	Scanner in=new Scanner(System.in);
    	
    	Registration r=new Registration();
//    	
    	do
    	{
    		
    		System.out.println("1.Registration");
    		System.out.println("2.Login");
    		System.out.println("3.Exit");
    		a=in.nextInt();
    		switch(a)
    		{
    		case 1:
    			System.out.println("1.Registration");
    			r.Register();
    			break;
    		case 2:
    			System.out.println("2.Login");
    			r.Login();
    			break;
    		case 3:
    			System.out.println("Exit bye");
//    			App app=new App();
//    			app. main(String[] arg);
    			break;
    		}
    	
   	}while(a<3);
    	
    }
    }


 	