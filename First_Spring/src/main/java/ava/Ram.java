package ava;

public class Ram implements Action {
	
	public Ram() {
		System.out.println("Ram object is created");
	}
	@Override
	public void eat() {
		System.out.println("Ram is eating");	
		
	}

	@Override
	public void sleep() {
		System.out.println("Ram is sleeping");	
		
	}

}
