package oopExam;

public class TestPhone {

	public static void main(String[] args) {
		
		
		AppleWatch appleWatch = new AppleWatch() {
			
			@Override
			public void digitalWatchInfo() {
				System.out.println("Giving implementation using inner class");
				
			}
			
			@Override
			public void watchInfo() {
				System.out.println("Giving implementation using inner class");
				
			}
			
			@Override
			public void appleWatchInfo() {
				System.out.println("Giving implementation using inner class");
				
			}
		};
		appleWatch.appleWatchInfo();

		
		Iphone1 iphone1 = new Iphone1();
		iphone1.setPrice(750);
		iphone1.setInfo("Apple");
		iphone1.setUser('M');
		iphone1.setMadeInUSA(true);
		System.out.println("i bought this "+iphone1.getInfo()+ " phone in 2000."+"the price was "+iphone1.getPrice()
		                   +" users sex "+iphone1.getUser()+" which is made in: "+iphone1.getMadeInUSA());
		System.out.println(iphone1.getPrice());
		System.out.println(iphone1.getInfo());
		System.out.println(iphone1.getUser());
		System.out.println(iphone1.getMadeInUSA());
		Iphone2 iphone2 = new Iphone2();
		iphone2.iphone2Info();
		
		Iphone6 iphone6 = new Iphone6();
		iphone6.feature();
	}

}
