package oopExam;

/*
-> interface is abstract in nature and abstract keyword is not necessary to use.
-> methods in interface can only be declared no implementation.
-> an interface can inherit multiple interface using extends keyword.
-> interface cannot have constructor and cannot be instantiated.
 */

public interface Phone extends Pager, Wakitoki {


//  interface cannot have constructor
	
	int phoneNumber = 0123445;
	
	public void interfaceInfo();
	public void call();
	public void message();
	public void camera();
	
	public static void battery() {
		System.out.println("static method is introduced from Java 8");
	}
	
	public default void wireless() {
		System.out.println("default methos is also introduced from Jave 8");
	}

}
