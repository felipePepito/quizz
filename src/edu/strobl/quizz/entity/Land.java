package edu.strobl.quizz.entity;

public class Land {

    private String name;
    private String hauptstadt;
    private long einwohnerzahlHauptstadt;
    private long einwohnerzahl;
    /** Flaeche in km^2 */
    private long flaeche;
    /** Einwohner pro km^2 */
    private int einwohnerProFlaeche;
    /** ISO-Länderkürzel, 2-Stellig */
    private String laenderkuerzel;
    private Kontinent kontinent;

    public Land(String name, String hauptstadt, long einwohnerzahlHauptstadt, long einwohnerzahl, long flaeche, int einwohnerProFlaeche, String laenderkuerzel, Kontinent kontinent) {
        this.name = name;
        this.hauptstadt = hauptstadt;
        this.einwohnerzahlHauptstadt = einwohnerzahlHauptstadt;
        this.einwohnerzahl = einwohnerzahl;
        this.flaeche = flaeche;
        this.einwohnerProFlaeche = einwohnerProFlaeche;
        this.laenderkuerzel = laenderkuerzel;
        this.kontinent = kontinent;
        kontinent.addLand(this);
    }

    @Override
    public String toString() {
        return name + " | " + kontinent.getName();
    }

    public String getName() {
        return name;
    }

    public String getHauptstadt() {
        return hauptstadt;
    }

    public long getEinwohnerzahlHauptstadt() {
        return einwohnerzahlHauptstadt;
    }

    public long getEinwohnerzahl() {
        return einwohnerzahl;
    }

    public long getFlaeche() {
        return flaeche;
    }

    public int getEinwohnerProFlaeche() {
        return einwohnerProFlaeche;
    }

    public String getLaenderkuerzel() {
        return laenderkuerzel;
    }

    public Kontinent getKontinent() {
        return kontinent;
    }
}
