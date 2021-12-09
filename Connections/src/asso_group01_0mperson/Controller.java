package asso_group01_0mperson;

public class Controller {

    /**
     * Add 'person' to 'group'.
     * If 'person' is connected to another group,
     * this connection is removed.
     */
    public static void addPersonToGroup(Group group, Person person) {
        Group oldGroup = person.getGroup();
        if (oldGroup != null)
            oldGroup.removePerson(person);
        group.addPerson(person);
    }

    public static void main(String[] args) {
        Group g1 = new Group("G1");
        Group g2 = new Group("G2");

        Person p1 = new Person("P1");
        Controller.addPersonToGroup(g1, p1);

        Person p2 = new Person("P2");
        Controller.addPersonToGroup(g1, p2);

        System.out.println("G1's persons: " + g1.getPersons());
        System.out.println("G2's persons: " + g2.getPersons());
        System.out.println("-----");

        Controller.addPersonToGroup(g2, p1);

        System.out.println("G1's persons: " + g1.getPersons());
        System.out.println("G2's persons: " + g2.getPersons());
    }
}
