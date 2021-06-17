package builder;

public enum Wheels {
    STEEL, SPORTS;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}