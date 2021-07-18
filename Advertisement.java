package saimen;

public class Ads extends BakeryDetails { //inheritance
	private String titleAd;
	private String date;
	
	
	
	public void printinfo() {//polymorphism
		System.out.println("---HOT PROMOTION---");
		Payment e = new AdvertisementandMarketingpromo();//interface
		System.out.println(titleAd + "Cash Voucher RM " + e.payment() + " in purchasement more than RM 500.00");
	}
	
	public void settitleAd(String titleAd) { // setter getter method //encapsulation
		this.titleAd = titleAd;
	}
	
	public void setdate(String date) {
		this.date = date;
	}
	
	public String gettitleAd() {
		return this.titleAd;
	}
	
	public String getdate() {
		return this.date;
	}
	
	

}
