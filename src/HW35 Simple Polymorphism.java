/*
    Given the child classes shown above, implement their parent class Pet. Pet should provide a single public class
    method called speak that takes a single argument which could be a Dog, a Cat, or another kind of Pet not shown
    above. speak should work as follows:
        - When speak is called with a Dog argument it should call woof on that Dog instance.
        - When speak is called with a Cat argument it should call meow on that Cat instance.
        - When speak is called on other Pet descendants it should not do anything.

    Pet should also provide a single constructor taking a single String argument. As shown above, that String indicates
    the type of that Pet. You may or may not find this useful when implementing speak.
 */

public class Pet {
    private String type;
    Pet(String petType) {
        type = petType;
    }
    public static void speak(Pet pet) {
        if (pet instanceof Dog) {
            Dog tucker = (Dog) pet;
            tucker.woof();
        }
        if (pet instanceof Cat) {
            Cat chaos = (Cat) pet;
            chaos.meow();
        }
    }
}