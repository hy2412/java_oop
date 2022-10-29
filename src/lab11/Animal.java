package lab11;

public abstract class Animal {

    protected int speed;
    protected String name;

    protected abstract int speed();
    protected abstract String name();

    @Override
    public String toString() {
        return "Animal{" +
                name + ":" +
                "speed=" + speed +
                '}';
    }
}
