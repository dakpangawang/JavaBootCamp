package oopExam;


public class Iphone2 extends Iphone1{
	
	public Iphone2() {
		super.setUser('M');
		super.getPrice();
		System.out.println(super.memory);
	}
	
	public void iphone2Info() {
		System.out.println("Iphone 2 Info");
	}
	
	public void iphone2Info(int price) {
		System.out.println("Iphone 2 price");
	}
	
}
