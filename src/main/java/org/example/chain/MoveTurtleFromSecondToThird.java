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

        if (stone.getName2() == null && stone.getName3() != null) {
            Turtle temp = stone.getName3();
            stone.setName3(null);
            stone.setName2(temp);
        }
        if (next != null) {
            next.move(stone);
        }
    }
}