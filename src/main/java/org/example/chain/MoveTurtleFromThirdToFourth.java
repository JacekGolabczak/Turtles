package org.example.chain;

import org.example.gameTortoise.Stone;
import org.example.gameTortoise.Turtle;

public class MoveTurtleFromThirdToFourth implements Moveable {

    private Moveable next;

    public MoveTurtleFromThirdToFourth(Moveable next) {
        this.next = next;
    }

    @Override
    public void move(Stone stone) {

        if (stone.getTurtle3() == null && stone.getTurtle4() != null) {
            Turtle temp = stone.getTurtle4();
            stone.setTurtle4(null);
            stone.setTurtle3(temp);
        }
        if (next != null) {
            next.move(stone);
        }
    }
}