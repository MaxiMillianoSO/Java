abstract class Ship {
    private String name;
    private final String identifier;
    private int maxPassengers;

    public Ship(String identifier, int maxPassengers) {
        this.identifier = identifier;
        this.maxPassengers = maxPassengers;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    public String getIdentifier() {
        return identifier;
    }

    public abstract String getDescription();

    public boolean matchesIdentifier(String identifier) {
        return this.identifier.equals(identifier);
    }

    public boolean canAccommodatePassengers(int numberOfPassengers) {
        return numberOfPassengers <= maxPassengers;
    }
}