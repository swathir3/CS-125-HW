/*
    Given the child classes shown above, implement their parent class Pet. (Note that Pet may have other children that
    are not shown here.) Pet should provide a single constructor taking a single String argument which indicates what
    kind of Pet is being created. Pet should override toString and return the type of that Pet which was passed to
    the Pet constructor.
 */

public class Pet {
    private String type;
    Pet(String pType) {
        type = pType;
    }
    public String toString() {
        return type;
    }
}