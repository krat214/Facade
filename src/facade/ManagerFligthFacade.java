package facade;

public class ManagerFligthFacade {

        private AvailabilityFligth availabilityFligth;
        private FlightReservation flightReservation;
        private EmitTicket emitTicket;

        public ManagerFligthFacade() {
            this.availabilityFligth = new AvailabilityFligth();
            this.flightReservation = new FlightReservation();
            this.emitTicket = new EmitTicket();
        }

        public void bookFlight(String from, String to, String date, String passengerName) {
            if (availabilityFligth.checkAvailability(from, to, date)) {
                flightReservation.bookFlight(from, to, date);
                emitTicket.emitTicket(from, to, date, passengerName);
            }else {
                System.out.println("Vuelo no dispopnible para la fecha seleccionada");
            }
        }
}
