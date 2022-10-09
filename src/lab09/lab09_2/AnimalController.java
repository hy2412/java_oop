package lab09.lab09_2;

import java.security.SecureRandom;
import java.util.List;
    public class AnimalController {
        public static List setRandomSpeed (List<RacingAnimal> animalList) {
                for (RacingAnimal animal : animalList) {
                    int randomSpeed = new SecureRandom().nextInt(animal.getMaxSpeed());
                    animal.setSpeed(randomSpeed);
                    System.out.println("The speed of " + animal.getName() + " is " + animal.getSpeed());
                }
                return animalList;
            }
    public static String findWinner (List<RacingAnimal> animalList) {
        int winSpeed = animalList.get(0).getSpeed();
        String winner = animalList.get(0).getName();

        for (RacingAnimal animal : animalList) {
            if (winSpeed < animal.getSpeed()) {
                winSpeed = animal.getSpeed();
                winner = animal.getName();
            }
        }
        return winner;
    }
}
