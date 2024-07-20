package samples.animal;

public abstract class Animal {
	
	//Properties
	String scientificName,popularName;
	int age;
	double mass;
	
	//behaviors
	public abstract void born();
	
	
	public abstract void eat() ;

	public abstract void grows();

	public abstract void reproduces();
	public abstract void die() ;
	
	
}
