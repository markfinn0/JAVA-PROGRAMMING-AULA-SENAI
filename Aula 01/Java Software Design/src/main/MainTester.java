package main;

public class MainTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Início do Roteiro 1");
		
		ConcreteClass1 cc1 = new ConcreteClass1(); //Chamada do método construtor....
		ConcreteClass2 cc2 = new ConcreteClass2(); //Chamada do método construtor....
		cc2.setPassword(3000);
		System.out.println(cc1.getPassword());
		System.out.println(cc2.password); //ele herda do concrete class1 se não existir
	
		
		System.out.println("fim do Roteiro 1");
		
		System.out.println("................");
		
		System.out.println("Início do Roteiro 2");
		
		
		AbstractClass ac1=new ConcreteClass();
		
		
	}

}
