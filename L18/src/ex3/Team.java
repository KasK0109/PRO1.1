package ex3;

import java.util.ArrayList;

public class Team {

    private String name;
    private ArrayList<Player> players;


    public Team(String name) {
        this.name = name;
        this.players = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addPlayer(Player p) {
        players.add(p);
    }

    public void printPlayers(){
        for (Player p : players) {
            System.out.println(p.getName() + ", " + p.getAge() + ", " + p.getScore());
        }
    }

    public double calcAverage() {
        double average = 0;
        int count = 0;
        for (Player p : players) {
            average += p.getScore();
            count++;
        }
        return average/count;
    }

    public int calcTotalScore() {
        int totalScore = 0;
        for (Player p : players) {
            totalScore += p.getScore();
        }
        return totalScore;
    }

    public int calcOldPlayersScore(int ageLimit) {
        int oldPlayerScore = 0;
        for (Player p : players) {
            if (p.getAge() > ageLimit) {
                oldPlayerScore += p.getScore();
            }
        }
        return oldPlayerScore;
    }

    public int maxScore() {
        int maxScore = Integer.MIN_VALUE;
        for (Player p : players) {
            if (p.getScore() > maxScore) {
                maxScore = p.getScore();
            }
        }
        return maxScore;
    }

    public ArrayList<String> bestPlayerNames() {
        ArrayList<String> bestPlayerNames = new ArrayList<>();
        for (Player p : players) {
            if (p.getScore() == maxScore()) {
                bestPlayerNames.add(p.getName());
            }
        }
        return bestPlayerNames;
    }
}
