package builder;

public enum Body {
    SEDAN, CABRIOLET, HATCHBACK;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}