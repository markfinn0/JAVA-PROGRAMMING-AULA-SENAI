package main;

public class ConcreteClass extends AbstractClass{

	//Properties
	public int password=3333;
	
	//Behaviors
	@Override
	public void sayHello() {
		System.out.println("EAEAEAEE");
	}
	
	public void originalSayHello() {
		
		super.sayHello();
	}

	@Override
	public void sayHi() {
		System.out.println("HI");
		
	}
	
}
