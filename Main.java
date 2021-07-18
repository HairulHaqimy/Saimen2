package saimen;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int opt,choice,select;
		String username ,password ;
		
		Ads ad = new Ads();
		ad.settitleAd("Get Discount 10% "); // encapsulation
		ad.setdate("31/7/2021");// encapsulation
		ad.printinfo();
		
		do {
		System.out.println("Please Select User as : \n1-Admin \n2-Customer");
		choice = scan.nextInt();
		switch(choice) {
		case 1 : System.out.println("--- Bakery System ---");
				 System.out.println("Enter Username : ");
		         username = scan.next();
				 System.out.println("Enter Password : ");
				 password = scan.next();
				 if(username.equals("erul") && password.equals("12345")) {
				 do {
		         System.out.println("\n1.Workers System \n2.Finance System \n3.Ads System");
		         System.out.println("Please Choose your option : ");
		         opt = scan.nextInt();
		         switch(opt) {
		         case 1 :Workers em = new Workers();
		        	 System.out.println(em);break;
		         case 2 :Finance f = new Finance();
		        	 System.out.println(f);break;
		         case 3 :ad.printinfo();
	        	 System.out.println("Voucher only available before "+ ad.getdate());
	        	 System.out.println();break;
		         }
		         if(opt<1 && opt>3) {
			         System.out.println("\n1.Workers System \n2.Finance System \n3.Ads System");
			         System.out.println("Please Choose Only Option(1-3)");
			         opt = scan.nextInt();
		         }
		         System.out.println("Continue As Admin?(1-Yes,2-No)");
		 		 select = scan.nextInt();
		         }while(select==1);break;
		         }
				 else {
					 System.out.println("Wrong input.");break;
				 }
		         
		         
		case 2 :do { 
				 System.out.println("--- Welcome to Bakery Indah ---");
        		 System.out.println("\n1.Bakery Menu  \n2.Billing System  \n3.Exit");
                 System.out.println("Please select your option : ");
                 opt = scan.nextInt();
                 switch(opt) {
                 case 1 :BakeryMenu d = new BakeryMenu();
                 		 System.out.println(d);break;
                 case 2 :BillingSystem b = new BillingSystem();
                	     System.out.println(b);break;
                 }
                 if(opt<1 && opt>2) {
                	 System.out.println("\n1.Bakery Menu  \n2.Billing System  \n3.Exit");			         System.out.println("Please Choose Only Option(1-3)");
			         opt = scan.nextInt();
		         }
                 System.out.println("Continue As Customer?(1-Yes,2-No)");
		 		 select = scan.nextInt();
		         }while(select==1);break;
        		 }
		System.out.println("Continue Using Bakery System?(1-Yes,2-No)");
		select = scan.nextInt();
		
		}while(select==1);
		System.out.println("Thankyou for visiting Bakery Indah.");
		
	}
}
