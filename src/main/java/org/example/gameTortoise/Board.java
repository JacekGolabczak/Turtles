package org.example.gameTortoise;

import java.util.ArrayList;
import java.util.List;

public class Board {

    //private Stone[] stones1 = new Stone[10];
    // private Set<Stone> stones3 = new HashSet<>(10);

    private static int STONE_NUMBERS = 10;

    private List<Stone> stone = new ArrayList<>(STONE_NUMBERS);

    public Board() {
        for (int i = 0; i < STONE_NUMBERS; i++) {
            this.stone.add(new Stone());
        }
    }

    public List<Stone> getStone() {
        return stone;
    }
}
