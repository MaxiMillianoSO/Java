//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Fleet fleet = new Fleet();

        try {
            Ferry ferry = new Ferry("F12345");
            ferry.setName("Dolphin");
            fleet.addShip(ferry);

            Cruise cruise = new Cruise("C67890", 3);
            cruise.setName("Hippo");
            fleet.addShip(cruise);

            System.out.println("Wszystkie statki w flocie:");
            for (Ship ship : fleet.getAllShips()) {
                System.out.println(ship.getDescription());
            }

            System.out.println("Statki z pojemnością przynajmniej 500 pasażerów:");
            for (Ship ship : fleet.getShipsWithCapacity(500)) {
                System.out.println(ship.getDescription());
            }

            fleet.removeShip("F12345");
            System.out.println("Po usunięciu statku F12345:");
            for (Ship ship : fleet.getAllShips()) {
                System.out.println(ship.getDescription());
            }

        } catch (IllegalArgumentException e) {
            System.out.println("Błąd: " + e.getMessage());
        }
    }
}