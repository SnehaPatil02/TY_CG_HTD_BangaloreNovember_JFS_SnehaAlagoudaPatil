package com.capgemini.abstraction.interfaceconcept;

public class TestBottle {
public static void main(String[] args) {
	Pepsi p1 = new Pepsi();
	p1.open();
	p1.drink();
	p1.juice();
	Bottle.close();
}
}
