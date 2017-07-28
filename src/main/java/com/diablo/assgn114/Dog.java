package com.diablo.assgn114;

import com.diablo.assgn114.Legs;

public class Dog implements Animal{
	
	int age;
	String sound;
	Legs leg;
	
	
	public Dog(int age, String sound, com.diablo.assgn114.Legs leg) {
		super();
		this.age = age;
		this.sound = sound;
		this.leg = leg;
	}


	public void makeSound(){
		System.out.println("The Dog of age "+age+" does "+sound+" and "+leg);
	}
	

}
