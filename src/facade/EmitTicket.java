package facade;

public class EmitTicket {

        public void emitTicket(String from, String to, String date, String passengerName) {
            System.out.println("Billete emitido para el vuelo de  " + from + " hacia " + to + " el día " + date + " para el pasajero " + passengerName);
        }
}
