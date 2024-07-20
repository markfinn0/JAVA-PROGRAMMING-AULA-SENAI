package auxiliary;

import main.AbstractClass;
import main.ConcreteClass;
import main.ConcreteClass1;
import main.ConcreteClass2;

public class AuxiliaryTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Início do Roteiro 1");
		ConcreteClass1 cc1 = new ConcreteClass1(); //Chamada do método construtor....
		ConcreteClass2 cc2 = new ConcreteClass2(); //Chamada do método construtor....
		
		System.out.println(cc1.getPassword());
		System.out.println(cc2.password);
		
		System.out.println("fim do Roteiro 1");
		
		System.out.println("................");
		
		System.out.println("Início do Roteiro 2");
		
		
		//COM POLIMORFISMO
		AbstractClass ac1=new ConcreteClass();
		System.out.println(ac1.password);
		
		
		//SEM POLIMORFISMO
		ConcreteClass ac2=new ConcreteClass();
		System.out.println(ac2.password);
		
		
		ac1.sayHello();
		ac2.sayHello();
		ac2.originalSayHello();
		ac2.sayHi();
		ac1.sayHi();

		System.out.println("fim do Roteiro 2");
	}

}
