package org.example.chain;

import org.example.gameTortoise.Stone;
import org.example.gameTortoise.Turtle;

public class MoveTurtleFromFirstToSecond implements Moveable {

    private Moveable next;

    public MoveTurtleFromFirstToSecond(Moveable next) {
        this.next = next;
    }

    @Override
    public void move(Stone stone) {

        if (stone.getTurtle1() == null && stone.getTurtle2() != null) {
            Turtle temp = stone.getTurtle2();
            stone.setTurtle2(null);
            stone.setTurtle1(temp);
        }
        if (next != null) {
            next.move(stone);
        }
    }
}
