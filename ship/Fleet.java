import java.util.ArrayList;
import java.util.List;
class Fleet {
    private final List<Ship> ships;

    public Fleet() {
        this.ships = new ArrayList<>();
    }

    public void addShip(Ship ship) throws IllegalArgumentException {
        for (Ship s : ships) {
            if (s.matchesIdentifier(ship.getIdentifier())) {
                throw new IllegalArgumentException("Statek o takim identyfikatorze już istnieje");
            }
        }
        ships.add(ship);
    }

    public void removeShip(String identifier) throws IllegalArgumentException {
        boolean removed = ships.removeIf(ship -> ship.matchesIdentifier(identifier));
        if (!removed) {
            throw new IllegalArgumentException("Statek o takim identyfikatorze nie istnieje");
        }
    }

    public boolean containsShip(String identifier) {
        return ships.stream().anyMatch(ship -> ship.matchesIdentifier(identifier));
    }

    public List<Ship> getAllShips() {
        return new ArrayList<>(ships);
    }

    public List<Ship> getShipsWithCapacity(int minPassengers) {
        List<Ship> result = new ArrayList<>();
        for (Ship ship : ships) {
            if (ship.canAccommodatePassengers(minPassengers)) {
                result.add(ship);
            }
        }
        return result;
    }
}


