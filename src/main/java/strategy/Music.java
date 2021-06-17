package strategy;

import java.util.logging.Logger;

public class Music implements ComputerStrategy {
    private static final Logger LOGGER = Logger.getLogger(Music.class.getName());

    @Override
    public void execute() {
        LOGGER.info("Music playing");
    }
}