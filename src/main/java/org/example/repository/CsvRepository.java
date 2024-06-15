package org.example.repository;

import org.example.gameTortoise.Card;
import org.example.gameTortoise.Colours;
import org.example.gameTortoise.Move;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class CsvRepository {

    public Set<Card> readCards() { // wczytywanie z plików .csv
        Set<Card> cardList = new HashSet<>();
        try {

            InputStream is = CsvRepository.class.getClassLoader().getResourceAsStream("cards.csv");
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String line;

            while ((line = br.readLine()) != null) {

                String[] strings = line.split(";");

                if (strings.length != 2) {
                    continue;
                }

                Colours colours = Colours.valueOf(strings[0]
                        .replaceAll("\\s+", "") // redukcja białych znaków
                        .toUpperCase()); // wszystko na duże litery

                Move move = Move.valueOf(strings[1]
                        .replaceAll("\\s+", "")
                        .toUpperCase());

                Card card = new Card(colours, move);
                cardList.add(card);
            }

        } catch (IOException e) {
            System.out.println("error");
        }

        return cardList;
    }
}

///// HOME WORK, zrobic klase repo z drugim plikiem do wczytania
//// postarać się ogarnać ify