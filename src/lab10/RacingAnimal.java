package lab10;
import lab10.Animal.Builder;
import java.util.Arrays;
import java.util.List;


public class RacingAnimal {
    public static void main(String[] args) {
        Builder builder = new Builder();
        Animal horse = builder.setName("Horse").setCanFly(false).build();
        Animal leopard = builder.setName("Leopard").setCanFly(false).build();
        Animal owl = builder.setName("Owl").setCanFly(true).build();
        Animal kangaroo = builder.setName("Kangaroo").setCanFly(false).build();
        Animal fox = builder.setName("Fox").setCanFly(false).build();
        Animal bat = builder.setName("Bat").setCanFly(true).build();


        List<Animal> animalList = Arrays.asList(bat, fox, kangaroo, owl, leopard, horse);
        List<Animal> getAnimalRacing = AnimalController.getAnimalRacing(animalList);
        List<Animal> getRandomNumber = AnimalController.getRandomSpeed(getAnimalRacing);

        System.out.println("The winner is: " + AnimalController.winner(getRandomNumber));
    }
}
