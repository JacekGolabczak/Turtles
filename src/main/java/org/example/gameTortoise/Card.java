package org.example.gameTortoise;

import java.util.Objects;

public class Card implements Comparable<Card> {

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

    @Override
    public String toString() {
        return "\n" + "Card{" + "colours=" + colours + ", move=" + move + '}';

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return colours == card.colours && move == card.move;
    }

    @Override
    public int hashCode() {
        return Objects.hash(colours, move);
    }

    @Override
    public int compareTo(Card o) {
        return 0;
    }
}
