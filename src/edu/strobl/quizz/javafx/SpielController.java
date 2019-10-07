package edu.strobl.quizz.javafx;

import edu.strobl.quizz.frage.Frage;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;



public class SpielController extends Controller {


    @FXML
    private Label labelNameSpieler1;

    @FXML
    private Label labelNameSpieler2;

    @FXML
    private Label labelPunkteSpieler1;

    @FXML
    private Label labelPunkteSpieler2;

    @FXML
    private Label labelFrage;
    @FXML
    private TextField antwort1;
    @FXML
    private TextField antwort2;
    @FXML
    private Button b1;
    @FXML
    private Button b2;

    private Frage aktuelleFrage;

    @Override
    public void initialisiere() {
        labelNameSpieler1.setText(quizz.getSpieler1().getName());
        labelNameSpieler2.setText(quizz.getSpieler2().getName());

        labelPunkteSpieler1.setText("0");
        labelPunkteSpieler2.setText("0");

        wechsleSpieler();
        neueFrage();
    }

    @FXML
    public void antwortSpieler1(ActionEvent e) {

        if (antwort1.getText().equals(aktuelleFrage.getAntworttext())) {
            quizz.getSpieler1().erhoehePunkte(2);
            antwort1.setStyle("-fx-background-color: #45db51");
            neueFrage();
        } else {
            quizz.getSpieler1().erhoehePunkte(-1);
            antwort1.setStyle("-fx-background-color: #ff412b");
            if (!quizz.isErsteAntwortFalsch()) {
                quizz.setErsteAntwortFalsch(true);
            } else {
                neueFrage();
            }
        }
        wechsleSpieler();
        labelPunkteSpieler1.setText(String.valueOf(quizz.getSpieler1().getPunkte()));
    }

    public void antwortSpieler2(ActionEvent e) {

        if(antwort2.getText().equals(aktuelleFrage.getAntworttext())) {
            quizz.getSpieler2().erhoehePunkte(2);
            antwort2.setStyle("-fx-background-color: #45db51");
            neueFrage();
        } else {
            quizz.getSpieler2().erhoehePunkte(-1);
            antwort2.setStyle("-fx-background-color: #ff412b");
            if (!quizz.isErsteAntwortFalsch()) {
                quizz.setErsteAntwortFalsch(true);
            } else {
                neueFrage();
            }
        }
        wechsleSpieler();
        labelPunkteSpieler2.setText(String.valueOf(quizz.getSpieler2().getPunkte()));

    }

    private void neueFrage() {
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        antwort1.setText("");
        antwort2.setText("");
        antwort1.setStyle("-fx-background-color: white");
        antwort2.setStyle("-fx-background-color: white");
        aktuelleFrage = quizz.getFragenIterator().next();
        labelFrage.setText(aktuelleFrage.getFragetext());

        quizz.setErsteAntwortFalsch(false);
    }

    private void wechsleSpieler() {

        if(quizz.getAktuellerSpieler() == quizz.getSpieler1()) {
            antwort2.setEditable(true);
            b2.setDisable(false);
            antwort1.setEditable(false);
            b1.setDisable(true);
            quizz.setAktuellerSpieler(quizz.getSpieler2());
            System.out.println(quizz.getAktuellerSpieler().getName());
        } else {
            antwort1.setEditable(true);
            b1.setDisable(false);
            antwort2.setEditable(false);
            b2.setDisable(true);
            quizz.setAktuellerSpieler(quizz.getSpieler1());
            System.out.println(quizz.getAktuellerSpieler().getName());
        }
    }
}
