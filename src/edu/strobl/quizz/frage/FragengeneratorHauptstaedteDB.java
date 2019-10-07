package edu.strobl.quizz.frage;

import edu.strobl.quizz.entity.Kontinent;
import edu.strobl.quizz.entity.Land;

import java.sql.*;
import java.util.ArrayList;

public class FragengeneratorHauptstaedteDB extends FragengeneratorHauptstaedte {

    @Override
    protected void generiereDaten() {

        try {
            Connection connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/quizz?user=quizz&password=quizz");
            Statement statement = connection.createStatement();

            // Abfrage aller Kontinente
            String abfrage = "select * from kontinente";

            ResultSet ergebnis = statement.executeQuery(abfrage);

            ArrayList<Kontinent> kontinente = new ArrayList<>();
            while (ergebnis.next()) {
                kontinente.add(new Kontinent(
                        ergebnis.getInt("id"),
                        ergebnis.getString("name"),
                        ergebnis.getBigDecimal("groesse"),
                        ergebnis.getBigDecimal("landoberflaecheprozentual"),
                        ergebnis.getBigDecimal("erdoberflaecheprozentual"),
                        ergebnis.getInt("einwohner"),
                        ergebnis.getBigDecimal("einwohnerprozentual"),
                        ergebnis.getBigDecimal("einwohnerproflaeche")
                ));
            }

            abfrage = "select * from laender";
            ergebnis = statement.executeQuery(abfrage);

            laender = new ArrayList<>();
            while (ergebnis.next()) {
                laender.add(new Land(
                        ergebnis.getString("name"),
                        ergebnis.getString("hauptstadt"),
                        ergebnis.getLong("einwohnerzahlhauptstadt"),
                        ergebnis.getLong("einwohnerzahl"),
                        ergebnis.getLong("flaeche"),
                        ergebnis.getInt("einwohnerproflaeche"),
                        ergebnis.getString("laenderkuerzel"),
                        kontinente.get(ergebnis.getInt("idkontinent")-1)
                ));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
