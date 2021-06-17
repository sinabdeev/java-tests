package builder;

public final class Car {
    private final String name;
    private final Color color;
    private final Brand brand;
    private final Body body;
    private final Wheels wheels;
    private final Tuning tuning;

    private Car(Builder builder) {
        this.name = builder.name;
        this.color = builder.color;
        this.brand = builder.brand;
        this.body = builder.body;
        this.wheels = builder.wheels;
        this.tuning = builder.tuning;
    }

    public Brand getBrand() {
        return brand;
    }

    public Body getBody() {
        return body;
    }

    public Wheels getWheels() {
        return wheels;
    }

    public Tuning getTuning() {
        return tuning;
    }

    public Color getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", color=" + color +
                ", brand=" + brand +
                ", body=" + body +
                ", wheels=" + wheels +
                ", tuning=" + tuning +
                '}';
    }

    /**
     *
     * The builder class.
     *
     */
    public static class Builder {

        private final Brand brand;
        private final String name;
        private Color color;
        private Body body;
        private Wheels wheels;
        private Tuning tuning;

        /**
         * Constructor
         */
        public Builder(Brand brand, String name) {
            if (brand == null || name == null) {
                throw new IllegalArgumentException("brand and name can not be null");
            }
            this.brand = brand;
            this.name = name;
        }

        public Builder withColor(Color color) {
            this.color = color;
            return this;
        }

        public Builder withBody(Body body) {
            this.body = body;
            return this;
        }

        public Builder withWheels(Wheels wheels) {
            this.wheels = wheels;
            return this;
        }

        public Builder withTuning(Tuning tuning) {
            this.tuning = tuning;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}