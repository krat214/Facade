package facade;

public class Client {
    public static void main(String[] args) {
        ManagerFligthFacade managerFligthFacade = new ManagerFligthFacade();
        managerFligthFacade.bookFlight("Bogota DC", "Cali", "2021-07-01", "Persona Personita");
    }
}
