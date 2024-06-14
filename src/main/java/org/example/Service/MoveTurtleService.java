package org.example.Service;

import org.example.chain.Moveable;
import org.example.chain.PrepareChain;
import org.example.gameTortoise.Card;
import org.example.gameTortoise.Stone;
import org.example.gameTortoise.Turtle;

import java.util.List;

public class MoveTurtleService {

    public void move(Card card, List<Stone> stones) {

        /// pomyslec nad ifami getTurtless

        int idnexOfturtle = 0;

        Turtle turtle = null;

        Moveable moveable = new PrepareChain();

        for (int i = 0; i < stones.size(); i++) {
            Stone stone = stones.get(i);
            if (stone == null) {
                continue;
            }

            if (stone.getTurtle1() != null) {
                if (card.getColours().equals(stone.getTurtle1().getColour())) {
                    idnexOfturtle = i;
                    turtle = stone.getTurtle1();
                    stone.setTurtle1(null);
                    moveable.move(stone);
                    break;
                }
            }
            if (stone.getTurtle2() != null) {
                if (card.getColours().equals(stone.getTurtle2().getColour())) {
                    idnexOfturtle = i;
                    turtle = stone.getTurtle2();
                    stone.setTurtle2(null);
                    moveable.move(stone);
                    break;
                }
            }
            if (stone.getTurtle3() != null) {
                if (card.getColours().equals(stone.getTurtle3().getColour())) {
                    idnexOfturtle = i;
                    turtle = stone.getTurtle3();
                    stone.setTurtle3(null);
                    moveable.move(stone);
                    break;
                }
            }
            if (stone.getTurtle4() != null) {
                if (card.getColours().equals(stone.getTurtle4().getColour())) {
                    idnexOfturtle = i;
                    turtle = stone.getTurtle4();
                    stone.setTurtle4(null);
                    moveable.move(stone);
                    break;
                }
            }
            if (stone.getTurtle5() != null) {
                if (card.getColours().equals(stone.getTurtle5().getColour())) {
                    idnexOfturtle = i;
                    turtle = stone.getTurtle5();
                    stone.setTurtle5(null);
                    moveable.move(stone);
                    break;
                }
            }
        }


        Stone nextStone = stones.get(idnexOfturtle + 1);
        if (nextStone.getTurtle1() == null) {
            nextStone.setTurtle1(turtle);
        } else if (nextStone.getTurtle2() == null) {
            nextStone.setTurtle2(turtle);
        } else if (nextStone.getTurtle3() == null) {
            nextStone.setTurtle3(turtle);
        } else if (nextStone.getTurtle4() == null) {
            nextStone.setTurtle4(turtle);
        } else if (nextStone.getTurtle5() == null) {
            nextStone.setTurtle5(turtle);
        }
    }
}
