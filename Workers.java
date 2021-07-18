package saimen;

import java.util.Scanner;

public class Workers extends BakeryDetails{ //Inheritance
	Scanner scan = new Scanner(System.in);
	private int noOfWorkers = 4;
	private double Salary1 = 3000.00; //admin salary
	private double Salary2 = 1500.00; //stocker salary
	private double Salary3 = 1500.00; //cashier salary
	private double Salary4 = 2000.00; //accountant salary
	private int respond;
	

	Workers() {
		System.out.println("---Workers System---");
		System.out.println("Bakery Indah contains a total of "+this.noOfWorkers+" workers.");
		Workersexp a = new Workersexp();
		System.out.printf("\nTotal Expenses On Salary : RM %.2f " , a.payment());
		printinfo();
		System.out.println();
	}
	
	public void printinfo() {
		do {
		System.out.println("\n1-Admin\n2-Storekeeper\n3-Cashier\n4-Accountants");
		System.out.print("\nSelect to check details : ");
		int choice = scan.nextInt();
		switch(choice) {
		case 1 : System.out.println("1 Admin");
		 		 System.out.println("\nName   : Erul"+
		 				 			"\nAge    : 20"+
		 				 			"\nTel    : 0136886562"+
		 				 			"\nSalary : RM " + this.Salary1);
		 		 					System.out.println();break;
		
		case 2 : System.out.println("1 Storekeeper");
				 System.out.println("\nName   : Apis"+
						 "\nAge    : 21"+
						 "\nTel    : 0118338535"+
						 "\nSalary : RM " + this.Salary2);
				 
		
		case 3 : System.out.println("1 Cashiers");
				 System.out.println("\nName   : Ajim"+
						 "\nAge    : 21"+
						 "\nTel    : 0104567889"+
						 "\nSalary : RM " + this.Salary3);
				
				 		 
		case 4 : System.out.println("1 Accountants");
				 System.out.println("\nName   : Fuad"+
						 "\nAge    : 21"+
						 "\nTel    : 0147893455"+
						 "\nSalary : RM " + this.Salary4);
				
		}
		System.out.println("Continue Checking another Workers?(1-Yes,0-No) : ");
	    respond = scan.nextInt();
	    if(respond!=1&&respond!=0) {
	    	System.out.println("Wrong Input.");
	    	System.out.println("Continue Checking another Workers?(1-Yes,0-No) : ");
		    respond = scan.nextInt();
	    }  
		}while(respond==1);
		System.out.println("End Checking Workers Personal Information");
	}
	
}