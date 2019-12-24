package com.capgemini.abstraction.interfaceconcept;

public class Pepsi implements  Bottle{
	@Override
public void open() {
	System.out.println("opening pepsi bottle");
}

	@Override
	public void drink() {
    System.out.println("drinking pepsi ");
		
	}
	@Override
	public void juice() {
		System.out.println("drinking juice");
	}

}
