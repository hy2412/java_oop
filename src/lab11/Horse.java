package lab11;

import java.security.SecureRandom;

public class Horse extends Animal {
    public Horse() {

        speed = new SecureRandom().nextInt(70);
        name = "Horse";
    }

    @Override
    protected int speed() {
        return this.speed;
    }

    @Override
    protected String name() {
        return this.name;
    }
}
