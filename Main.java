package saimen;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int opt,choice,select;
		Advertisement ad = new Advertisement();
		ad.settitleAd("Get Discount 10% "); // encapsulation
		ad.setdate("31/7/2021");// encapsulation
		ad.printinfo();
	
		
		do {
		System.out.println("Please Select User as : \n1-Admin \n2-Customer");
		choice = scan.nextInt();
		switch(choice) {
		
		case 1 : System.out.println("** Bakery System **");
				 System.out.println("As an Admin you are allowed to enter : ");
		         do {
		         System.out.println("\n1.Finance System ");
		         opt = scan.nextInt();
		         switch(opt) {
		         case 1 :Finance em = new Finance();
		        	 	 System.out.println(em);break;
		         case 2 :ad.printinfo();
	        	 System.out.println("Voucher only available before "+ ad.getdate());
	 		 System.out.println();break;
		         
		         }
		         System.out.println("Continue As Admin?(1-Yes,2-No)");
		 		 select = scan.nextInt();
		         }while(select==1);break;
		         
		         
		case 2 :do { 
				 System.out.println("** Welcome to the bakery **");
        		 System.out.println("\n1.Bakery details \n2.Bakery Menu \n3.Exit");
                 System.out.println("Please select your option : ");
                 opt = scan.nextInt();
                 switch(opt) {
               
                 case 1 :BakeryMenu a = new BakeryMenu();
                	 	 System.out.println(a);break;
 
                	 	 
                 }
                 if(opt<1 && opt>3) {
                	 System.out.println("\n1.Bakery details \n2.Bakery Menu \n3.Exit");			        
                	 System.out.println("Please Choose");
			         opt = scan.nextInt();
		         }
                 System.out.println("Continue As Customer?(1-Yes,2-No)");
		 		 select = scan.nextInt();
		         }while(select==1);break;
        		 }
		System.out.println("Continue Using Bakery System?(1-Yes,2-No)");
		select = scan.nextInt();
		
		}while(select==1);
		System.out.println("Thankyou for visiting this Bakery.");
		
	}
}
