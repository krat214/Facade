package facade;

public class AvailabilityFligth {

    public boolean checkAvailability(String from, String to, String date) {
        System.out.println("Comprobación de la disponibilidad de vuelos desde " + from + " hacia " + to + " el día " + date);
        return true;
    }

}
