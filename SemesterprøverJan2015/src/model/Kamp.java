package model;

import java.time.LocalDate;

public class Kamp {

    private String sted;
    private LocalDate dato;
    private LocalDate tid;

    public Kamp(String sted, LocalDate dato, LocalDate tid) {
        this.sted = sted;
        this.dato = dato;
        this.tid = tid;
    }

    public String getSted() {
        return sted;
    }

    public LocalDate getDato() {
        return dato;
    }

    public LocalDate getTid() {
        return tid;
    }
}
