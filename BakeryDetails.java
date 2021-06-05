package saimen;

import java.util.Scanner;

public abstract class BakeryDetails {
	
	protected String name;
	protected double open;
	protected double close;
	protected String contact;
	
	BakeryDetails(){
		this.name = "Bakery Indah";
		this.contact = "042340909";
		this.open = 8.00;
		this.close = 8.00;
		
	}
	
	public void print() {
		System.out.println("Name     : " + this.name);
		System.out.println("Contact: " + this.contact);
		System.out.println("Open at  : " + this.open + " am");
		System.out.println("Close at : " + this.close + " pm");
	}
	public abstract void printinfo(); //abstract method and polymorphism
}




