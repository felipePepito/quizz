package edu.strobl.quizz.frage;

import java.util.ArrayList;

public interface Fragengenerator {

    public ArrayList<Frage> generiereFragen();
    public ArrayList<Frage> generiereFragen(int anzahl);

}
