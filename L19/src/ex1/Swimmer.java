package ex1;

import java.util.ArrayList;

public class Swimmer {

    private String name;
    private ArrayList<Double> lapTimes;

    // association --> 0..1 TrainingPlan
    private TrainingPlan trainingPlan;

    public Swimmer(String name, ArrayList<Double> lapTimes) {
        this.name = name;
        this.lapTimes = lapTimes;
    }

    public String getName() {
        return this.name;
    }

    /** Note: Nullable return value */
    public TrainingPlan getTrainingPlan() {
        return trainingPlan;
    }

    /** Pre: This person is not connected to a group. */
    public void setTrainingPlan(TrainingPlan trainingPlan) {
        this.trainingPlan = trainingPlan;
    }

    /** Pre: This person is connected to a group. */
    public void removeTrainingPlan() {
        this.trainingPlan = null;
    }

    public ArrayList<Double> getLapTimes() {
        return lapTimes;
    }

    /** Return the fastest lap time. */
    public double bestLapTime() {
        // TODO: implement!
        double bestLapTime = Integer.MAX_VALUE;
        for (int i = 0; i < getLapTimes().size(); i++) {
            double time = getLapTimes().get(i);
            if (time < bestLapTime) {
                bestLapTime = time;
            }
        }
        return bestLapTime;
    }

    /**
     * Returns how many training hours the swimmer has each week
     */
    public int allTrainingHours() {
        int totalHours = 0;
        totalHours = (trainingPlan.getWeeklyStrengthHours() + trainingPlan.getWeeklyWaterHours());
        return totalHours;
    }
}
