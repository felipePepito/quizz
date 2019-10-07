package edu.strobl.quizz.frage;

public class Frage {

    private String fragetext;
    private String antworttext;

    public Frage(String fragetext, String antworttext) {
        this.fragetext = fragetext;
        this.antworttext = antworttext;
    }

    public String getFragetext() {
        return fragetext;
    }

    public String getAntworttext() {
        return antworttext;
    }
}
