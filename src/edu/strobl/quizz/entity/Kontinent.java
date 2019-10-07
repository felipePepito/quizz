package edu.strobl.quizz.entity;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Kontinent {

    private int id;
    private String name;
    /** Fläche in Mio. km² */
    private BigDecimal groesse;
    /** Landoberfläche Prozentual zur Welt-Landoberfläche */
    private BigDecimal landoberflaecheProzentual;
    /** Erdoberfläche prozentual zur gesamten Erdoberfläche */
    private BigDecimal erdoberflaecheProzentual;
    /** Einwohnerzahl in Mio. Einwohner */
    private int einwohnerzahl;
    /** Einwohner prozentual zur Erdbevölkerung */
    private BigDecimal einwohnerProzentual;
    /** Einwohner pro km² */
    private BigDecimal einwohnerProFlaeche;

    private ArrayList<Land> laender;

    public Kontinent(int id, String name, BigDecimal groesse, BigDecimal landoberflaecheProzentual, BigDecimal erdoberflaecheProzentual, int einwohnerzahl, BigDecimal einwohnerProzentual, BigDecimal einwohnerProFlaeche) {
        this.id = id;
        this.name = name;
        this.groesse = groesse;
        this.landoberflaecheProzentual = landoberflaecheProzentual;
        this.erdoberflaecheProzentual = erdoberflaecheProzentual;
        this.einwohnerzahl = einwohnerzahl;
        this.einwohnerProzentual = einwohnerProzentual;
        this.einwohnerProFlaeche = einwohnerProFlaeche;
        this.laender = new ArrayList<>();
    }

    public void addLand(Land land) {
        this.laender.add(land);
    }

    public ArrayList<Land> getLaender() {
        return this.laender;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getGroesse() {
        return groesse;
    }

    public BigDecimal getLandoberflaecheProzentual() {
        return landoberflaecheProzentual;
    }

    public BigDecimal getErdoberflaecheProzentual() {
        return erdoberflaecheProzentual;
    }

    public int getEinwohnerzahl() {
        return einwohnerzahl;
    }

    public BigDecimal getEinwohnerProzentual() {
        return einwohnerProzentual;
    }

    public BigDecimal getEinwohnerProFlaeche() {
        return einwohnerProFlaeche;
    }
}
