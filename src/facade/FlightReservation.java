package facade;

public class FlightReservation {

    public void bookFlight(String from, String to, String date) {
        System.out.println("Vuelo reservado desde" + from + " hacia " + to + " el dia " + date);
    }

}
