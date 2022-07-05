import java.util.ArrayList;
import java.util.List;

public class Zoo {

  /**
   * Feeds different bird sections of the zoo.
   *
   * @param list list of birds of particular type.
   */
  public static void feed(List<? extends Bird> list) {
    // TODO fix method declaration
    System.out.println("Feeding birds");
    // TODO feed birds in the cycle
    for (Bird bird : list) bird.eat();
  }

  /**
   * Adds birds to a flying section of the zoo.
   *
   * @param list list of birds of particular type.
   * @param bird a new bird.
   */
  public static void acceptBird(List <? super FlyingBird> list, FlyingBird bird) {
    // TODO fix method declaration

    System.out.println("Accepting a bird to a section");
    // TODO check flying bird wings
    // TODO add a bird to the list and print it
    bird.checkWings();
    list.add(bird);
  }

  /**
   * Adds bird to the general list.
   *
   * @param list    list of birds.
   * @param newBird bird to add.
   */
  public static void registerBird(List <Bird> list, Bird newBird) {
    // TODO fix method declaration
    System.out.println("Adding a bird to the birds list");
    list.add(newBird);
    for (Object bird : list) {
      System.out.println(bird);
    }
  }
}