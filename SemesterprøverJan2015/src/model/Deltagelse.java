package model;

public class Deltagelse {

    private boolean afbud;
    private String begrundelse;

    public Deltagelse(boolean afbud) {
        this.afbud = afbud;
    }

    public String getBegrundelse() {
        return begrundelse;
    }

    public void setAfbud(boolean afbud) {
        this.afbud = afbud;
    }

    public void setBegrundelse(String begrundelse) {
        this.begrundelse = begrundelse;
    }

}
