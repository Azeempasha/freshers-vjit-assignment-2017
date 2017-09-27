package com.restu.rrrr;
import java.io.FileReader;
import java.util.*;

public class restuarent
{
 private Scanner sc;
public int menu() 
 {
  int stat1=0,stat2=0,tsp=0,mainn1=0,mainn2=0,tmp=0,tp=0, desert=0,desert2=0,tdp=0;
  sc = new Scanner(System.in);
	 while(true)
	  {
		System.out.println("\nENTER YOUR ORDER OR SATISFIED THEN TYPE 4");  
        int order=sc.nextInt();
		switch(order)
		{
		  case 1: System.out.println(" SELECT YOUR STARTER DISH WITH QUANTITY\n1.STARTER DISH NO 1\n2.STARTER DISH NO 2 ");
		          int statorder=sc.nextInt();
				  int statquant=sc.nextInt();
				  System.out.println(" ORDER-"+statorder+"\n QUANTITY-"+statquant);
				  if(statorder==1) 
					 stat1=50*statquant;
				  if(statorder==2)
					 stat2=60*statquant;
				     break;
		  case 2: System.out.println(" SELECT YOUR MAINCOURSE DISH WITH QUANTITY\n1.MAIN COURSE 1\n2.MAINCOURSE 2");
		          int mainorder=sc.nextInt();
				  int mainquant=sc.nextInt();
				  System.out.println(" ORDER-"+mainorder+"\n QUANTITY-"+mainquant);
				  if(mainorder==1)
					mainn1=150*mainquant;
				  if(mainorder==2)
					mainn2=300*mainquant;
				  break;
		  case 3: System.out.println(" SELECT YOUR DESERT WITH QUANTITY\n1.DESERT 1\nDESERT 2");
		          int desertorder=sc.nextInt();
				  int desertqunat=sc.nextInt();
				  System.out.println(" ORDER-"+desertorder+"\n QUANTITY-"+desertqunat);
				  if(desertorder==1)
					desert=70*desertqunat;
				  if(desertorder==2)
					desert2=40*desertqunat;
				     break;
		  case 4: System.out.println(" SATISFIED"); 
			      tsp=stat1+stat2;
		          tmp=mainn1+mainn2;
		          tdp=desert+desert2;
		          tp=tsp+tmp+tdp;
				  return tp;
		}
	}
}

public static void main(String[] args) throws Exception
{
  Scanner sc=new Scanner(System.in);
  restuarent rms=new  restuarent();
  while(true)
  {
    System.out.println("IS CUSTOMER ARRIVED \n1.YES \n2.NO");
    int ch=sc.nextInt();
    if(ch==1)
	{
	  label:while(true)
		{
         System.out.println("CUSTOMER IS FOR \n1.DINE\n2.TAKE AWAY");
		 int cd=sc.nextInt();
		 if (cd==1)
		  {
		   System.out.println("\nCUSTOMER WALKS IN");
		   System.out.println("\nENTER NO OF CUSTUMERS");
		   int cn=sc.nextInt();
		   if(cn<=4)
		   {   
		   System.out.println("\nALLOT ONE TABLE TO THE CUSTOMER ");
		   		   }
		   else
		   { System.out.println("\nALLOT TWO TABLES TO THE CUSTOMER ");
		   }
		   int tn=sc.nextInt();
           System.out.println("\nCUSTOMERS SITS AT TABLE NO "+ tn+"\nBUS BOY SERVES WATER TO CUSTOMERS AT TABLE NO "+ tn);
		   System.out.println("\nMANAGER SHOWS THE MENU\n");
		   FileReader fr= new FileReader("F:\\Test.txt");
		   int i;
		   while ((i=fr.read())!=-1)
           System.out.print((char)i);
		   fr.close();
		   int tp=rms.menu();
           System.out.println("\nMANAGER PLACES ORDER TO CHEF");
		   System.out.println(" CHEF GETS ORDER AND PREPARES THE ORDER \n");
   		   System.out.println("THE SERVER SERVES THE FOOD");
		   System.out.println("\n\tBILLING");
		   System.out.println("\nTOTAL BILL TO BE PAID BY THE CUSTOMER IS Rs."+tp);
		   System.out.println("\nBILL PAID BY CUSTOMER");
		   rms.feedback();
		   System.out.println("\nPAYMENT IS REGISTERED");
		   System.out.println("\nBOY CLEANS THE TABLE "+tn);
		   break label;
		  }
		 if (cd==2)
		  {
		   System.out.println("\nCUSTOMER WAKS IN");
		   FileReader fr= new FileReader("F:\\Test.txt");
		   int i;
		   while ((i=fr.read())!=-1)
           System.out.print((char)i);
		   fr.close();
		   int tp=rms.menu();
		   System.out.println("\nPARCEL RECEIVED BY CUSTOMER ");
		   System.out.println("\nBILLING\nTOTAL BILL TO BE PAID BY THE CUSTOMER IS Rs."+tp);
		   System.out.println("\nBILL PAID BY CUSTOMER");
		   rms.feedback();
		   break label;
	      }}}
    else System.exit(1);
  }}
public void feedback()
{
  Scanner sc=new Scanner(System.in);
  System.out.println("\nCUSTOMER FEEDBACK");
  System.out.println("\n1.GOOD\n2.AVERAGE\n3.BAD");
  int fd=sc.nextInt();
  switch(fd)
  {
    case 1:System.out.println("\nMANAGER:THANK YOU,VISIT AGAIN ");break;
	case 2:System.out.println("\nMANAGER:THANK YOU ");break;
    case 3:System.out.println("\nMANAGER:SORRY,WE WILL TRY TO IMPROVE");break;
  }}}
