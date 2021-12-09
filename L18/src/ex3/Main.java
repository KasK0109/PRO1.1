package ex3;

public class Main {
    public static void main(String[] args) {
        Team agf = new Team("AGF");

        Player p1 = new Player("Hans",18);
        Player p2 = new Player("Mathias", 27);
        Player p3 = new Player("Nicolai", 36);
        Player p4 = new Player("Daniel", 16);

        agf.addPlayer(p1);
        agf.addPlayer(p2);
        agf.addPlayer(p3);
        agf.addPlayer(p4);

        p1.addScore(10);
        p2.addScore(2);
        p3.addScore(7);
        p4.addScore(22);

        System.out.print("Player names:");
        agf.printPlayers();
        System.out.println();


        System.out.println("Best player names: " + agf.bestPlayerNames());
        System.out.println();

        System.out.println("Average: " + agf.calcAverage());
        System.out.println();

        System.out.println("Old Player score: " + agf.calcOldPlayersScore(26));
        System.out.println();

        System.out.println("Total score: " + agf.calcTotalScore());
        System.out.println();

        System.out.println("Max score: " + agf.maxScore());
        System.out.println();
    }
}
