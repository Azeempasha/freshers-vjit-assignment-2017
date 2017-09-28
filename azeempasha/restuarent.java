package com.restuarents.restuarent_s;
import java.util.Scanner;
public class restuarent {
private static Scanner s;
public static void parking() 
{
System.out.println("\t\t\t\t\tPARKING\n====================================================================================================\n2 OR 4 WHEELER PARKKING");
System.out.println("ENTER VEHICLE TYPE \n1.TWO WHEELER\n2.FOUR WHEELER ");
int bb=s.nextInt();
System.out.println("ENTER VEHICLE NO");
String ab=s.next();
if(bb==1)
  {
	System.out.println("PAY  Rs.20 ");
	System.out.println("PARKING TICKET FOR VEHICLE NO\t"+ab+"\tIS TAKEN");
	System.out.println("VEHICLE IS PARKED");
  }
else if(bb==2)
{
	System.out.println("PAY Rs.40");
	System.out.println("PARKING TICKET FOR VEHICLE NO\t"+ab+"\tIS TAKEN");
	System.out.println("VEHICLE IS PARKED");
}
else{
	System.out.println("INVALID ENTRY ENTER AGAIN");
	parking();
	}
	}
public static void billing()
{
	     int tp=menu();
	     System.out.println("\nMANAGER PLACES ORDER TO CHEF");
	     System.out.println("\nCHEF GETS ORDER AND PREPARES THE ORDER \n");
         System.out.println("THE SERVER SERVES THE FOOD");
	     System.out.println("\n\t\t\t\tBILLING\n====================================================================================================");
	     System.out.println("\nTOTAL BILL TO BE PAID BY THE CUSTOMER IS Rs."+tp);
	     System.out.println("\nBILL PAID BY CUSTOMER");
	     System.out.println("\nPAYMENT IS REGISTERED");
	     remarks();
	}
public static void main(String[] args) throws Exception
	{
		System.out.println("\t\t\tAZEEM'S RESTUARANT  WELCOMES YOU!!\n====================================================================================================");
		s=new Scanner(System.in);
		System.out.println("\nARE THE CUSTOMERS ARRIVING\n1.YES\n2.NO");
        int aa=s.nextInt();
         if(aa==1)
         {
        	 parking();
        	 System.out.println("\nCUSTOMERS WALK INTO RESTUARENT");
        	 int z=vacancy();
        	 if(z==1){
        	         System.out.println("\nENTER NUMBER OF CUSTOMERS");
        	         int b=s.nextInt();
			         if(b<=4)
        	            {
        		          System.out.println("MANAGER ALLOTS ONE TABLE TO THE CUSTOMERS");
        		          System.out.println("BOY SERVES WATER TO THE CUSTOMERS");
           	              billing();
      		            }
        	         else
        	            {  
        		          System.out.println("MANAGER ALLOTS REQUIRED NUMBERS OF TABLES BASED ON NUMBER OF CUSTOMERS");
        		          System.out.println("BOY SERVES WATER TO THE CUSTOMERS");
        		          billing();
        	            }
        	 
                      }
        	 else
                 System.out.println("CUSTOMERS WALKS OUT FROM RESTUARENT");
           }
           
         
        	 if(aa==2)
             {
 		     System.out.println("\nNO CUSTOMERS");
             }
        	 
         }       
		
public static int menu() {
	int stat1=0,stat2=0,main1=0,main2=0,des1=0,des2=0,ts1=0,totstat=0,totmain=0,totdes=0,tp=0,d1=0,d2=0,dt=0;
	 System.out.println("MANAGER SHOWS THE MENU");
	 System.out.println("\t\t\t\t\tMENU\n====================================================================================================");
	 System.out.println("\n1.STARTERS\n2.MAIN COURSE\n3.DESSERTS\n4.TODAYS's SPECIAL\n5.DRINKS");
	 while(true)
	 {
		 System.out.println("SELECT YOUR ORDER,IF SATISFIED TYPE 6");
		 int c=s.nextInt();
	 switch(c)
	 {
	 case(1):System.out.println("SELECT STARTERS\n1.STARTER ITEM--1\n2.STARTER ITEM--2");
	         int d=s.nextInt();
	         System.out.println("ENTER QUANTITY");
	         int quant=s.nextInt();
	         if(d==1)
	            stat1=50*quant;
	         if(d==2)
	        	 stat2=70*quant;
	         totstat=stat1+stat2;
	         break;
	 case(2):System.out.println("SELECT MAIN COURSE\n1.MAIN COURSE DISH--1\n2.MAIN COURSE DISH--2");
             int e=s.nextInt();
             System.out.println("ENTER QUANTITY");
             int f=s.nextInt();
             if(e==1)
             main1=150*f;
             if(e==2)
    	     main2=200*f;
             totmain=main1+main2;
             break;      
	 case(3):System.out.println("SELECT DESSERT\n1.DESSERT--1\n2.DESSERT--2");
             int g=s.nextInt();
             System.out.println("ENTER QUANTITY");
             int h=s.nextInt();
             if(g==1)
              des1=150*h;
             if(g==2)
              des2=200*h;
             totdes=des1+des2;
             break;      
	 case(4):System.out.println("SELECT TODAY's SPECIAL\n1.TODAY's DISH");
             int i=s.nextInt();
             System.out.println("ENTER QUANTITY");
             int j=s.nextInt();
             if(i==1)
             ts1=150*j;
             break;
	 case(5):System.out.println("SELECT DRINKS\n1.DRINK----1\n2.DRINK----2");
	         int k=s.nextInt();
             System.out.println("ENTER QUANTITY");
             int l=s.nextInt();
             if(k==1)
             d1=40*l;
             if(k==2)
             d2=30*l;
             dt=d1+d2;
             break;     
	 case(6):tp=totstat+totmain+totdes+ts1+dt;  
             return tp;        
	 }
	 }
	  
}
public static void remarks(){
	System.out.println("\t\t\t\tFEEDBACK\n====================================================================================================");
	System.out.println("MANAGER ASKS THE CUSTOMER FOR FEEDBACK");
	System.out.println("IS THE SERVICE GOOD");
	String bc=s.next();
	System.out.println("IS THE FOOD GOOD");
	String cb=s.next();
	System.out.println("HOW MUCH DO YOU RATE OUR RESTUARENT OUT OF 5");
	int p=s.nextInt();
	System.out.println("OVERALL EXPERIENCE\n1.GOOD\n2.AVERAGE\n3.BAD");
	int n=s.nextInt();
    if(n==1)
    {System.out.println("MANAGER:THANK YOU,VISIT AGAIN");
    parking1();}
    if(n==2)
    {System.out.println("MANAGER:THANK YOU ");
    parking1();}
    if(n==3)
    {System.out.println("MANAGER:SORRY,WE WILL IMPROVE");
    parking1();}
}
public static int vacancy()
{
	System.out.println("\t\t\t\tVACANCY\n====================================================================================================");
	System.out.println("MANAGER CHECKS FOR VACANCY\n1.AVAILABLE\n2.NOT AVAILABLE");
	int w=s.nextInt();
	int x=0;
	switch(w)
	{
	case(1):x=1;break;
	case(2):System.out.println("MANAGER: SORRY,NO VACANT TABLES ");
		    x=0;break;
	default:System.out.println("INVALID ENTRY");
		    vacancy();
	}
	return x;
}
public static void parking1()
{
System.out.println("CUSTOMERS WALKS OUT FROM RESTUARENT");
System.out.println("CUSTOMERS TAKES THE VEHICLE FROM PARKING AND LEAVES");	
}
}	

