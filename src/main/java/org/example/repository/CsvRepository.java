package org.example.repository;

import org.example.gameTortoise.Card;
import org.example.gameTortoise.Colours;
import org.example.gameTortoise.Move;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class CsvRepository {

    public List<Card> readCards() { // wczytywanie z plików .csv
        List<Card> cardList = new ArrayList<>();
        try {

            InputStream is = CsvRepository.class.getClassLoader().getResourceAsStream("cards.csv");
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String line;

            while ((line = br.readLine()) != null) {
                String[] strings = line.split(";");
                Card card = new Card(
                        Colours.valueOf(strings[0]),
                        Move.valueOf(strings[1])
                );
                cardList.add(card);
            }

        } catch (IOException e) {
            System.out.println("error");
        }




        return cardList;
    }
}
