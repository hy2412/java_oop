package lab10;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

public class AnimalController {
    public static List getAnimalRacing(List<Animal> animalList) {
        List<Animal> listRacer = new ArrayList<>();
        for (Animal animal : animalList) {
            if (!animal.isCanFly()) {
                listRacer.add(animal);
            }
        }
        return listRacer;
    }

    public static List getRandomSpeed(List<Animal> animalList) {
        List<Animal> randomSpeedList = new ArrayList<>();
        for (Animal animal : animalList) {
            int randomSpeed = new SecureRandom().nextInt(100);
            randomSpeedList.add(new Animal.Builder().setName(animal.getName()).setSpeed(randomSpeed).build());
            System.out.println("The speed of " + animal.getName() + " is " + randomSpeed);
        }
        return randomSpeedList;
    }

    public static String winner (List<Animal> animalList) {
        int winSpeed = animalList.get(0).getSpeed();
        String winner = animalList.get(0).getName();

        for (Animal animal : animalList) {
            if (winSpeed < animal.getSpeed()) {
                winSpeed = animal.getSpeed();
                winner = animal.getName();
            }
        }
        return winner;
    }
}
