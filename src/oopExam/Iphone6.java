package oopExam;

public class Iphone6 extends Iphone5 {

	public void feature() {
		System.out.println("In iphone 6, new features like compass has been added");
	}

	/*
	 * Method overloading: When the methods has same name but different sets of
	 * arguments and it happens during compile time. Method overriding: When the
	 * methods has same method signature but the logic or body is different and it
	 * happens during runtime.
	 */

	public int materials(int ramPrice, int campPrice) {
		int totalPrice = ramPrice + campPrice;
		return totalPrice;
	}

	public int materials(int ramPrice, int campPrice, String processorPrice) {
		int totalPrice = ramPrice + campPrice;
		return totalPrice;
	}

	public void materials(int price) {

	}

	public final void materials(int price, int weight, int memory) {

	}
	
	public static void materials(String version) {

	}


}
