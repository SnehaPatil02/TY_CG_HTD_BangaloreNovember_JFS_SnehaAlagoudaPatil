package com.capgemini.abstraction.interfaceconcept;

public interface Bottle {
void open();

public default void juice() {
	System.out.println("drinking juice");
}
void drink();

static void close() {
	System.out.println("closing the bottle");
}
}
