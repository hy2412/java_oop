package lab09.lab09_2;

import java.security.SecureRandom;

public class Horse extends RacingAnimal {
    @Override
    public String getName() {
        return "Horse";
    }

    @Override
    public int getMaxSpeed() {
        return 75;
    }
}
