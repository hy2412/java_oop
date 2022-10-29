package lab11;

import java.util.Arrays;
import java.util.List;

public class AnimalTest {
    public static void main(String[] args) {
        Animal tiger = new Tiger();
        Animal horse = new Horse();

        List<Animal> animals = Arrays.asList(tiger, horse);
        System.out.println(animals);
        Animal winner = new RacingController().getWinner(animals);
        System.out.println(winner);
    }
}
