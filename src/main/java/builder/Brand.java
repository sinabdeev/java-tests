package builder;

public enum Brand {
    BMW, AUDI, MERCEDES, OPEL;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}