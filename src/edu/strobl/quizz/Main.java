package edu.strobl.quizz;

import edu.strobl.quizz.frage.Fragengenerator;
import edu.strobl.quizz.frage.FragengeneratorHauptstaedteDB;
import edu.strobl.quizz.frage.FragengeneratorHauptstaedteTest;
import edu.strobl.quizz.javafx.Controller;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.net.URL;

public class Main extends Application {

    private Quizz quizz;
    private URL startURL;
    private URL spielURL;
    private URL endeURL;

    private Stage stage;

    @Override
    public void start(Stage stage) throws Exception{

        quizz = new Quizz();
        Fragengenerator fragengenerator = new FragengeneratorHauptstaedteDB();
        fragengenerator.generiereFragen(4);

        quizz.setFragen(fragengenerator.generiereFragen());
        this.stage = stage;
        stage.setTitle("quizz!");

        startURL = getClass().getResource("javafx/start.fxml");
        spielURL = getClass().getResource("javafx/spiel.fxml");
        endeURL = getClass().getResource("javafx/ende.fxml");

        switchScene("start");

        stage.show();


    }

    public void switchScene(String scene) throws Exception {

        FXMLLoader loader = new FXMLLoader();
        if (scene.equals("ende")) {
            loader.setLocation(endeURL);
        } else if (scene.equals("spiel")) {
            loader.setLocation(spielURL);
        } else {
            loader.setLocation(startURL);
        }

        Parent parent = loader.load();
        Controller controller = loader.getController();
        controller.setQuizz(quizz);
        controller.setApplication(this);
        controller.initialisiere();

        stage.setScene(new Scene(parent));
    }


    public static void main(String[] args) {

        launch(args);


    }
}
