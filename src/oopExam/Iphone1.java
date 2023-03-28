package oopExam;

public class Iphone1 extends AppleWatch  {

	@Override
	public  void watchInfo() {
		System.out.println("Giving implementation for Interface Watch from Class Iphone1");
		
	}

	@Override
	public void digitalWatchInfo() {
		System.out.println("Giving implementation for Interface digitalWatch from Class Iphone1");
		
	}
	
	private int price;
	private String info;
	private char user;
	private boolean madeInUSA;
	public String memory = "256gb";
	
	public void setPrice (int price) {
		this.price = price;
	}
	public void setInfo (String info) {
		this.info = info;
	}
	public void setUser (char user) {
		this.user = user;
	}
	public void setMadeInUSA (Boolean madeInUSA) {
		this.madeInUSA = madeInUSA;
	}
	
	public int getPrice () {
		return price;
	}
	public String getInfo () {
		return info;
	}
	public char getUser () {
		return user;
	}
	
	public boolean getMadeInUSA () {
		return madeInUSA;
	}
	
	public void regularClassInfo() {
		getPrice();
		getInfo();
		getUser();
		getMadeInUSA();
		watchInfo();
		digitalWatchInfo();
	}
	
	public void youtube() {
		System.out.println("Youtube feature is added");
	}

	@Override
	public void appleWatchInfo() {
		System.out.println("only abstract method of apple watch");
		
	}

}
