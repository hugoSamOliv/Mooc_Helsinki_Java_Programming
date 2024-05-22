/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.logic;
import FlightControl.domain.Airplane;
import FlightControl.domain.Place;
import FlightControl.domain.Flight;
import java.util.Collection;
import java.util.HashMap;
/**
 *
 * @author hugo
 */
public class FlightControlLogic {
    private HashMap<String, Airplane> airplanes;
    private HashMap<String, Place> places;
    private HashMap<String, Flight> flights;

    public FlightControlLogic(HashMap<String, Airplane> airplanes, HashMap<String, Place> places, HashMap<String, Flight> flights) {
        this.airplanes = airplanes;
        this.places = places;
        this.flights = flights;
    }
    
    public void addAirplane(String ID, int capacity) {
        Airplane airplane = new Airplane(ID, capacity);
        
        this.airplanes.putIfAbsent(ID, airplane);
    }
    
    public void addFlight(Airplane airplane, String departure, String destination) {
        this.places.putIfAbsent(departure, new Place(departure));
        this.places.putIfAbsent(destination, new Place(destination));
        
        Flight newFlight = new Flight(airplane, this.places.get(departure), this.places.get(destination));
        this.flights.put(newFlight.toString(), newFlight);
    }

    public Collection<Airplane> getAirplanes() {
        return airplanes.values();
    }

    public Collection<Flight> getFlights() {
        return flights.values();
    }

    public Collection<Place> getPlaces() {
        return places.values();
    }
    
    public Airplane getAirplane(String ID) {
        return this.airplanes.get(ID);
    }
    
}
