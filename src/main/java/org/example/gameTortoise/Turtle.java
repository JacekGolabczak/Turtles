package org.example.gameTortoise;

public class Turtle {

    private Colours colour;

    public Colours getColour() {
        return colour;
    }

    public void setColour(Colours colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Turtle is " + colour;
    }
}
