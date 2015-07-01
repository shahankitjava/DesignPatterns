package com.designpatterns.demo.behavioral.strategy;

public class TransportationMode {

	public void transport(Vehicle vehicle){
		
		System.out.print("Transportation Mode : ");
		vehicle.transport();
	}
	
}
