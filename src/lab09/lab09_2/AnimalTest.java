package lab09.lab09_2;

import java.util.Arrays;
import java.util.List;

public class AnimalTest {
    public static void main(String[] args) {
        RacingAnimal dog = new Dog();
        RacingAnimal tiger = new Tiger();
        RacingAnimal horse  = new Horse();

        List<RacingAnimal> animalList = Arrays.asList(dog, horse, tiger);
        List<RacingAnimal> setRandomSpeed = AnimalController.setRandomSpeed(animalList);
        System.out.println("The winner is: " + AnimalController.findWinner(animalList));
    }
}
