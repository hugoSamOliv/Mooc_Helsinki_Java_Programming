/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.domain;

/**
 *
 * @author hugo
 */
public class Flight {
    private Airplane airplane;
    private Place departure;
    private Place destination;

    public Flight(Airplane airplane, Place departure, Place destination) {
        this.airplane = airplane;
        this.departure = departure;
        this.destination = destination;
    }

    public Airplane getAirplane() {
        return airplane;
    }

    public Place getDeparture() {
        return departure;
    }

    public Place getDestination() {
        return destination;
    }

    @Override
    public String toString() {
        return this.airplane.toString() + " (" + this.departure + "-" + this.destination + ")";
    }
}
