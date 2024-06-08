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

        if (stone.getName3() == null && stone.getName4() != null) {
            Turtle temp = stone.getName4();
            stone.setName4(null);
            stone.setName3(temp);
        }
        if (next != null) {
            next.move(stone);
        }
    }
}