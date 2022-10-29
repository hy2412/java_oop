package lab11;

import java.security.SecureRandom;

public class Tiger extends Animal {
    public Tiger() {
        speed = new SecureRandom().nextInt(100);
        name = "Tiger";
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
