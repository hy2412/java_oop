package lab10;

public class Animal {
    private boolean canFly;
    private String name;
    private int speed;


    private Animal (Builder builder){
        this.name = builder.name;
        this.canFly = builder.canFly;
        this.speed = builder.speed;
    }

    public boolean isCanFly() {
        return this.canFly;
    }

    public String getName() {
        return this.name;
    }

    public int getSpeed() {
        return this.speed;
    }

    public static class Builder {
        private boolean canFly;
        private String name;
        private int speed;

        public Builder() {
        }

        public Builder setCanFly(boolean canFly) {
            this.canFly = canFly;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setSpeed(int speed) {
            this.speed = speed;
            return this;
        }

        public Animal build(){
            return new Animal(this);
        }
    }
}
