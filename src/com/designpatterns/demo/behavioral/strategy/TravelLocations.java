package com.designpatterns.demo.behavioral.strategy;

/**
 * <p>
 * This is STRATEGY PATTERN comes under behavioral design patterns category.
 * </p>
 * 
 * <p>
 * This pattern helps you provide the different implementation of a single
 * contract between different entities.
 * </p>
 * 
 * @author ankitsh
 */
public class TravelLocations {

	public static void main(String[] args) {

		TransportationMode transportationMode = new TransportationMode();

		Vehicle airplane = new Airplane();
		transportationMode.transport(airplane);

		Vehicle train = new Train();
		transportationMode.transport(train);

		Vehicle cruise = new Cruise();
		transportationMode.transport(cruise);

	}

}
