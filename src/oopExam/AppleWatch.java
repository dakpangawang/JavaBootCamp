package oopExam;

/*
 -> Abstract class is created using abstract keyword.
 -> Abstract class can have both abstract and non-abstract methods.
 -> Abstract keyword have to use for abstract methods.
 -> It can have constructors but cannot be instantiated.
 */

public abstract class AppleWatch extends AppleWatchSeries5 implements Watch, DigitalWatch{
	/*
-> Yes we can create variable and constructors inside abstract class.
-> But we cannot instantiate abstract class because abstract class must have atleast one abstract method.
     */	
	
	public abstract void appleWatchInfo();
	
	 
	public void abstractClassInfo() {
		System.out.println("Abstract keyword is necessary to used for abstract methods in abstract class whereas in interface its optional and concrete class doesnt have abstract methods at all.");
		System.out.println("Abstract class inherit from interface but interface cannot inherit from abstract class");
	}

}
