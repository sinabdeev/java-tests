package builder;

public enum Color {
    RED, GREEN, YELLOW, BLUE, BLACK, WHITE;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}