import AnimalProj.Animal;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Animal cat = new Animal("Angela", true, true, "meow", 5.3);
//        Animal cat2 = new Animal();
        System.out.println(cat.isFurOrNot());
        System.out.println( cat.isWarmOrCOld());
        System.out.println(cat.getAnimalInfo());

        Animal snake = new Animal("Snaky",false , false, "meow", 5.3);
        System.out.println(snake.isFurOrNot());
        System.out.println( snake.isWarmOrCOld());
        System.out.println(snake.getAnimalInfo());

    }
}