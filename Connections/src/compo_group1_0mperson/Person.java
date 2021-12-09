package compo_group1_0mperson;

public class Person {
    private final String name;

    Person(String name) { // OBS: package visibility
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    //-----------------------------------------------------

    // composition --> 1 Group
    Group group; // OBS: package visibility

    public Group getGroup() {
        return group;
    }
}
