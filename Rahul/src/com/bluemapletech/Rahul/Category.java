package com.bluemapletech.Rahul;

import java.util.ArrayList;
import java.util.Scanner;

public class Category {

	

	Scanner in=new Scanner(System.in);
	int a,p,i;
	int ui;
	String nop[]=new String[100];
	int pz[]=new int[100];
	int id[]=new int[100];
	int r=0,n;
	String name;

	Registration r1 = new Registration();

	int get,quan;
	public void cat()
	{
		  ArrayList<String> i=new ArrayList<String>();
		  i.add("1.Equipments");
		  i.add("2.Dress");
		  i.add("3.Doll");
		  i.add("4.Stationaries");
		  System.out.println(i);
		  System.out.println("Enter the category  :");
		  Scanner m=new Scanner(System.in);
		  String n=m.nextLine();
		  i.add(n);
		 
        for(String a:i)
		 {
			 System.out.println(a);
		 }

		
	}
	public void pro()
	{	    
		System.out.println("Enter  Name of Product:");
	    nop[ui] = in.next(); 
	    System.out.println("Enter product id");
	    id[ui] = in.nextInt();
	    System.out.println("Enter prize:");
	    pz[ui] = in.nextInt();
	    ui++;	      
		 
	}
	public void shop()
	{
		for(i=0;i<ui;i++)
	    {
	    	System.out.println(nop[i]+"\t"+id[i]+"\t"+pz[i]);
	    }
		System.out.println("Enter number of product:");
		n=in.nextInt();
		for(int j=0;j<n;j++)
		{
		System.out.println("Enter product name:");
		name=in.next();
		System.out.println("Enter number of quantity:");
		quan=in.nextInt();
		}
		System.out.println("productname\t id \tprize");
		for(i=0;i<ui;i++)
		{
			if(nop[i].equals(name))
			{
				get=i;	
			}
				
		}
		System.out.println(nop[get]+"\t"+id[get]+"\t"+pz[get]);			
		
	}
	public void list()
	{
		
		for(int i=0;i<n;i++)
		{System.out.println("orderedproduct"+id[get]);
			System.out.println("prize:"+pz[get]);
			r=pz[get]*quan;
			System.out.println("\t\tTotal cost:"+""+r);
		}
		
	}

	}




