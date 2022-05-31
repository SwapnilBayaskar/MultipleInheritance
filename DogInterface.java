package com.MultipleInheritance;

public interface DogInterface {
	
	public default void sound() {
		
		String strDogSound = "Woof woof !";
		System.out.println("Dog makes the sound : "+strDogSound);
	}

}
