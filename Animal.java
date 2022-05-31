package com.MultipleInheritance;

public class Animal implements DogInterface, CatInterface {
	
	public void sound() {
		
		DogInterface.super.sound();
		
		CatInterface.super.sound();
		
	}

}
