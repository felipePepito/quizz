package edu.strobl.quizz.javafx;

import edu.strobl.quizz.Main;
import edu.strobl.quizz.Quizz;


public class Controller {

    protected Quizz quizz;
    protected Main application;

    public void setQuizz(Quizz quizz) {
        this.quizz = quizz;
    }

    public Quizz getQuizz() {
        return quizz;
    }

    public Main getApplication() {
        return application;
    }

    public void setApplication(Main application) {
        this.application = application;
    }

    public void switchScene(String scene) {
        try {
            application.switchScene(scene);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void initialisiere() {}
}
