package asso_person01_01group;

public class Person {
    private final String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    //-----------------------------------------------------

    // association --> 0..1 Group
    Group group; // nullable, OBS: package visibility

    /** Note: Nullable return value. */
    public Group getGroup() {
        return group;
    }
}
