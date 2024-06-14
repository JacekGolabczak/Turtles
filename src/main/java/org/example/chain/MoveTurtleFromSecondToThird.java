package org.example.chain;

import org.example.gameTortoise.Stone;
import org.example.gameTortoise.Turtle;

public class MoveTurtleFromSecondToThird implements Moveable {

    private Moveable next;

    public MoveTurtleFromSecondToThird(Moveable next) {
        this.next = next;
    }

    @Override
    public void move(Stone stone) {

        if (stone.getTurtle2() == null && stone.getTurtle3() != null) {
            Turtle temp = stone.getTurtle3();
            stone.setTurtle3(null);
            stone.setTurtle2(temp);
        }
        if (next != null) {
            next.move(stone);
        }
    }
}