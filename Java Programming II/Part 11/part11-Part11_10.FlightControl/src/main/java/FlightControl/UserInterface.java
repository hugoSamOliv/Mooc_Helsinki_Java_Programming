/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl;
import FlightControl.domain.Airplane;
import FlightControl.domain.Place;
import FlightControl.domain.Flight;
import  FlightControl.logic.FlightControlLogic;
import java.util.Collection;
import java.util.Scanner;
/**
 *
 * @author hugo
 */
public class UserInterface {
    private FlightControlLogic logic;
    private Scanner scanner;
    
    public UserInterface(FlightControlLogic newLogic) {
        this.logic = newLogic;
        this.scanner = new Scanner(System.in);
    }
    
    public void start() {
        assertControl();
        System.out.println();
        flightControl();
        System.out.println();
    }
    
    public void assertControl() {
        System.out.println("Airport Asset Control");
        System.out.println("--------------------");
        System.out.println();
        
        String command = "";
        while (!command.equals("x")) {
            System.out.println("Choose an action:");
            System.out.println("[1] Add an airplane");
            System.out.println("[2] Add a flight");
            System.out.println("[x] Exit Airport Asset Control");
            System.out.print("> ");
            command = scanner.nextLine();
            processAssertCommand(command);
        }
            
    }
    
    public void processAssertCommand(String command) {
        if (command.equals("1")) {
            addAirplane();
        } else if (command.equals("2")) {
            addFlight();
        }
    }
    
    public void addAirplane() {
        System.out.println();
        System.out.print("Give the airplane id: ");
        System.out.println();
        String ID = scanner.nextLine();
        System.out.print("Give the airplane capacity:");
        System.out.println();
        int capacity = Integer.parseInt(scanner.nextLine());
        logic.addAirplane(ID, capacity);
    }
    
    public void addFlight() {
        System.out.println();
        System.out.print("Give the airplane id: ");
        Airplane airplane = logic.getAirplane(scanner.nextLine());
        System.out.println();
        System.out.print("Give the departure airport id: ");
        String departureId = scanner.nextLine();
        System.out.println();
        System.out.print("Give the target airport id: ");
        String targetId = scanner.nextLine();
        System.out.println();
        logic.addFlight(airplane, departureId, targetId);
    }
    
    public void flightControl() {
        System.out.println("Flight Control");
        System.out.println("------------");
        System.out.println();
        
        String command = "";
        while (!command.equals("x")) {
            System.out.println("Choose an action:");
            System.out.println("[1] Print airplanes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print airplane details");
            System.out.println("[x] Quit");
            System.out.print("> ");
            
            command = scanner.nextLine();
            
            processControlCommand(command);
        }
    }
    
    public void processControlCommand(String  command) {
        if (command.equals("1")) {
            printAirplanes();
        } else if (command.equals("2")) {
            printFlights();
        } else if (command.equals("3")) {
            printAirplaneDetails();
        }
    }
    
    public void printAirplanes() {
        Collection<Airplane> airplanes = logic.getAirplanes();
        
        for (Airplane airplane : airplanes) {
            System.out.println(airplane);
        }
    }
    
    public void printFlights() {
        Collection<Flight> flights = logic.getFlights();
        
        for (Flight flight : flights) {
            System.out.println(flight);
        }
    }
    
    public void printAirplaneDetails() {
        Airplane airplane = askForAirplane();
        System.out.println(airplane);
    }
    
    public Airplane askForAirplane() {
        Airplane airplane = null;
        while (airplane == null) {
            System.out.println("Give the airplane id:");
            String airplaneId = scanner.nextLine();
            
            airplane = logic.getAirplane(airplaneId);
            if (airplane == null) {
                System.out.println("No airplane with the id " + airplaneId + ".");
            }
        }
        
        return airplane;
    }
}
