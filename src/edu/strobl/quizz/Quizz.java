package edu.strobl.quizz;

import edu.strobl.quizz.frage.Frage;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * Model Klasse für alle Daten des Spiels
 */
public class Quizz {

    private ArrayList<Frage> fragen;
    private ListIterator<Frage> fragenIterator;

    private Spieler spieler1;
    private Spieler spieler2;
    private Spieler aktuellerSpieler;
    private boolean ersteAntwortFalsch;

    private int anzahlRunden;

    public Quizz() {
        ersteAntwortFalsch = false;
    }

    public Quizz(Spieler spieler1, Spieler spieler2, int anzahlRunden) {
        this.spieler1 = spieler1;
        this.spieler2 = spieler2;
        this.anzahlRunden = anzahlRunden;

    }

    public Spieler getSpieler1() {
        return spieler1;
    }

    public void setSpieler1(Spieler spieler1) {
        this.spieler1 = spieler1;
    }

    public Spieler getSpieler2() {
        return spieler2;
    }

    public void setSpieler2(Spieler spieler2) {
        this.spieler2 = spieler2;
    }

    public int getAnzahlRunden() {
        return anzahlRunden;
    }

    public void setAnzahlRunden(int anzahlRunden) {
        this.anzahlRunden = anzahlRunden;
    }

    public ArrayList<Frage> getFragen() {
        return fragen;
    }

    public void setFragen(ArrayList<Frage> fragen) {
        this.fragen = fragen;
        fragenIterator = this.fragen.listIterator();
    }

    public ListIterator<Frage> getFragenIterator() {
        return fragenIterator;
    }

    public Spieler getAktuellerSpieler() {
        return aktuellerSpieler;
    }

    public void setAktuellerSpieler(Spieler aktuellerSpieler) {
        this.aktuellerSpieler = aktuellerSpieler;
    }

    public boolean isErsteAntwortFalsch() {
        return ersteAntwortFalsch;
    }

    public void setErsteAntwortFalsch(boolean ersteAntwortFalsch) {
        this.ersteAntwortFalsch = ersteAntwortFalsch;
    }
}
