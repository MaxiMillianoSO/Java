class Ferry extends Ship {
    public Ferry(String identifier) {
        super(identifier, 600);
    }

    @Override
    public String getDescription() {
        return getIdentifier() + "\n" +
                "nazwa: " + (getName() != null ? getName() : "brak") + "\n" +
                "typ: prom pasażerski\n" +
                "liczba pasażerów: " + getMaxPassengers();
    }
}
