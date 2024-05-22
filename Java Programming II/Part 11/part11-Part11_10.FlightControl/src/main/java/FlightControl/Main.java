package FlightControl;
import FlightControl.UserInterface;
import FlightControl.domain.Airplane;
import FlightControl.domain.Place;
import FlightControl.domain.Flight;
import FlightControl.logic.FlightControlLogic;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        HashMap<String, Airplane> airplanes = new HashMap<>();
        HashMap<String, Place> places = new HashMap<>();
        HashMap<String, Flight> flights = new HashMap<>();
        FlightControlLogic logic = new FlightControlLogic(airplanes, places, flights);
        
        UserInterface userInterface = new UserInterface(logic);
        
        userInterface.start();
    }
}
