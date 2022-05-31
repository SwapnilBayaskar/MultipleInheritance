package com.MultipleInheritance;

public interface CatInterface {
	
	public default void sound() {
		
		String strCatSound = "Meow meow !";
		System.out.println("Cat makes the sound : "+strCatSound);
	}

}
