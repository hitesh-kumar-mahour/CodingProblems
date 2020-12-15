package oops_prc;

abstract class Animal{
	String name;
	abstract void sound();
}

class Bird extends Animal{
	
	@Override
	void sound() {
		System.out.println("shims");
		
	}
	
	void fly()
	{
		System.out.println("bird");
	}
}

class Dog extends Animal{
	
	@Override
	void sound() {
		System.out.println("barks");
	}
	void fly()
	{
		System.out.println("aero");
	}
	
}
public class Inheritence {

	
	public static void main(String[] args) {
		Animal[] arr= {new Bird(),new Dog()};
		Animal a=new Bird();
	//	a.fly();	// we cant use fly method of class bird as 'a' is object of animal
		a.sound();
		arr[0].sound();
		arr[1].sound();
	}
	
}
