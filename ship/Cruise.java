class Cruise extends Ship {
    private int numberOfPools;

    public Cruise(String identifier) {
        super(identifier, 600);
        this.numberOfPools = 1;
    }

    public Cruise(String identifier, int numberOfPools) {
        super(identifier, 600);
        this.numberOfPools = numberOfPools;
    }

    public int getNumberOfPools() {
        return numberOfPools;
    }

    public void setNumberOfPools(int numberOfPools) {
        this.numberOfPools = numberOfPools;
    }

    @Override
    public String getDescription() {
        return getIdentifier() + "\n" +
                "nazwa: " + (getName() != null ? getName() : "brak") + "\n" +
                "typ: wycieczkowiec\n" +
                "liczba pasażerów: " + getMaxPassengers() + "\n" +
                "liczba basenów: " + numberOfPools;
    }
}
