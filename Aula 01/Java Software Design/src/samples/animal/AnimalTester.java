package samples.animal;

public class AnimalTester {

	public static void main(String[] args) {
		
		Sharks shark =new Sharks();
		
		shark.setScientificName("Galeocerdo cuvier");
		shark.setPopularName("Tubarão Tigre");
		shark.setAge(20);
		shark.setMass(250.0);
		
		
		System.out.println(shark.scientificName);
		System.out.println(shark.scientificName);
		System.out.println(shark.popularName);
		System.out.println(shark.age);
		System.out.println(shark.mass);
		
		
	
		shark.born();
		shark.eat();
		shark.grows();
		shark.reproduces();
		shark.die();
	}

}
