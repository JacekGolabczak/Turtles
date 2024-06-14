package org.example.chain;

import org.example.gameTortoise.Stone;
import org.example.gameTortoise.Turtle;

public class MoveTurtleFromFourthToFifth implements Moveable {
    private Moveable next;

    public MoveTurtleFromFourthToFifth(Moveable next) {
        this.next = next;
    }

    @Override
    public void move(Stone stone) {

        if (stone.getTurtle4() == null && stone.getTurtle5() != null) {
            Turtle temp = stone.getTurtle5();
            stone.setTurtle5(null);
            stone.setTurtle4(temp);
        }
        if (next != null) {
            next.move(stone);
        }
    }
}
