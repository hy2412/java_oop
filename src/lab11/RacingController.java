package lab11;

import java.util.List;

public class RacingController {

    public Animal getWinner(List<Animal> animalList) {
        Animal winner = animalList.get(0);
        for (Animal animal : animalList) {
            if (animal.speed() > winner.speed()){
                winner = animal;
            }
        }
        return  winner;
    }
}
