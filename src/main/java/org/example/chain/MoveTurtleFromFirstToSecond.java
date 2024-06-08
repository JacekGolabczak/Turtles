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

        if (stone.getName1() == null && stone.getName2() != null) {
            Turtle temp = stone.getName2();
            stone.setName2(null);
            stone.setName1(temp);
        }
        if (next != null) {
            next.move(stone);
        }
    }
}
