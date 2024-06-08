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

        if (stone.getName4() == null && stone.getName5() != null) {
            Turtle temp = stone.getName5();
            stone.setName5(null);
            stone.setName4(temp);
        }
        if (next != null) {
            next.move(stone);
        }
    }
}
