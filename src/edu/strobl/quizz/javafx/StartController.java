package edu.strobl.quizz.javafx;

import edu.strobl.quizz.Quizz;
import edu.strobl.quizz.Spieler;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class StartController extends Controller {

    @FXML
    private TextField textAnzahlRunden;

    @FXML
    private TextField textNameSpieler1;

    @FXML
    private TextField textNameSpieler2;


    @FXML
    public void starteQuizz(ActionEvent event) {

        quizz.setSpieler1(new Spieler(textNameSpieler1.getText()));
        quizz.setSpieler2(new Spieler(textNameSpieler2.getText()));
        quizz.setAnzahlRunden(Integer.parseInt(textAnzahlRunden.getText()));

        switchScene("spiel");

        /*
        URL url = getClass().getResource("spiel.fxml");

        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(url);

        try {
            Parent parent = loader.load();
            SpielController controller = (SpielController)loader.getController();
            controller.setQuizz(quizz);
            controller.initialisiere();
            stage.setScene(new Scene(parent));
        } catch (IOException e) {
            e.printStackTrace();
        }
        */
    }

}
