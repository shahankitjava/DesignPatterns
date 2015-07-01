package com.designpatterns.demo.behavioral.strategy;

public interface Vehicle {
	public void transport();
}

class Airplane implements Vehicle{
	public void transport() {
		System.out.println("Flying");
	}
}

class Train implements Vehicle{
	public void transport() {
		System.out.println("Running");
	}
}
class Cruise implements Vehicle{
	public void transport() {
		System.out.println("Floating");
	}
}