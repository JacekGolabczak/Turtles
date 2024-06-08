package org.example.gameTortoise;

public class Card {

    private Colours colours;
    private Move move;

    public Card(Colours colours, Move move) {
        this.colours = colours;
        this.move = move;
    }

    public Colours getColours() {
        return colours;
    }

    public Move getMove() {
        return move;
    }
}
