package lab09.lab09_2;

import java.security.SecureRandom;

public class Dog extends RacingAnimal {
    @Override
    public String getName() {
        return "Dog";
    }
    @Override
    public int getMaxSpeed() {
        return 60;
    }
}
