package Abstraction;

public abstract class Bike {
	Bike()    //constructor
	{
		System.out.println("bike is created");
	}
	abstract void run();
	void changeGear()
	{
		System.out.println("gear changed");
	}
}
