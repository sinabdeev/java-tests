/**
 * Паттерн Builder (Строитель)
 */

import builder.Body;
import builder.Brand;
import builder.Car;
import builder.Color;
import builder.Tuning;
import builder.Wheels;
import java.util.logging.Logger;

public class Test03 {
    private static final Logger LOGGER = Logger.getLogger(Test03.class.getName());

    /**
     * Program entry point
     *
     * @param args command line args
     */
    public static void main(String[] args) {

        Car brutalCar = new Car.Builder(Brand.BMW, "X6")
                .withBody(Body.HATCHBACK)
                .withColor(Color.BLACK)
                .withTuning(Tuning.LEATHER)
                .withWheels(Wheels.STEEL)
                .build();

        LOGGER.info(brutalCar.toString());

        Car premiumCar = new Car.Builder(Brand.MERCEDES, "E200")
                .withBody(Body.SEDAN)
                .withColor(Color.WHITE)
                .withTuning(Tuning.WHITE)
                .withWheels(Wheels.SPORTS)
                .build();

        LOGGER.info(premiumCar.toString());
    }
}