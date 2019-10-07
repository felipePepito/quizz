package edu.strobl.quizz.frage;

import edu.strobl.quizz.entity.Land;

import java.util.ArrayList;

public abstract class FragengeneratorHauptstaedte implements Fragengenerator  {

    protected ArrayList<Land> laender;

    public ArrayList<Frage> generiereFragen() {
        ArrayList<Frage> fragen = new ArrayList<>();
        generiereDaten();

        String frageVorlage = "Was ist die Hauptstadt von ";
        for (Land land : laender) {
            Frage frage = new Frage(frageVorlage + land.getName(), land.getHauptstadt());
            fragen.add(frage);
        }

        return fragen;
    }

    public ArrayList<Frage> generiereFragen(int anzahl) {
        ArrayList<Frage> fragen = new ArrayList<>();
        generiereDaten();

        String frageVorlage = "Was ist die Hauptstadt von ";
        int zufallszahl;
        int anzahlLaender = laender.size();
        Land land;
        while(anzahl > 0) {
            zufallszahl = (int)(Math.random()*anzahlLaender+1);
            land = laender.get(zufallszahl);
            Frage frage = new Frage(frageVorlage + land.getName(), land.getHauptstadt());
            fragen.add(frage);
            laender.remove(zufallszahl);
            anzahl--;
        }

        return fragen;
    }

    abstract void generiereDaten();

}
