package org.example.Service;

import org.example.chain.Moveable;
import org.example.chain.PrepareChain;
import org.example.gameTortoise.Card;
import org.example.gameTortoise.Colours;
import org.example.gameTortoise.Stone;
import org.example.gameTortoise.Turtle;

import java.util.List;

public class MoveTurtleService {

    public void move(Card card, List<Stone> stones) {

        int idnexOfturtle = 0;
        Turtle turtle = null;

        Moveable moveable = new PrepareChain();

        for (int i = 0; i < stones.size(); i++) {
            Stone stone = stones.get(i);
            if (stone == null) {
                continue;
            }
            if (stone.getName1() != null) {
                if (card.getColours().equals(stone.getName1().getColour())) {
                    idnexOfturtle = i;
                    turtle = stone.getName1();
                    stone.setName1(null);
                    moveable.move(stone);
                    break;
                }
            }
            if (stone.getName2() != null) {
                if (card.getColours().equals(stone.getName2().getColour())) {
                    idnexOfturtle = i;
                    turtle = stone.getName2();
                    stone.setName2(null);
                    moveable.move(stone);
                    break;
                }
            }
            if (stone.getName3() != null) {
                if (card.getColours().equals(stone.getName3().getColour())) {
                    idnexOfturtle = i;
                    turtle = stone.getName3();
                    stone.setName3(null);
                    moveable.move(stone);
                    break;
                }
            }
            if (stone.getName4() != null) {
                if (card.getColours().equals(stone.getName4().getColour())) {
                    idnexOfturtle = i;
                    turtle = stone.getName4();
                    stone.setName4(null);
                    moveable.move(stone);
                    break;
                }
            }
            if (stone.getName5() != null) {
                if (card.getColours().equals(stone.getName5().getColour())) {
                    idnexOfturtle = i;
                    turtle = stone.getName5();
                    stone.setName5(null);
                    moveable.move(stone);
                    break;
                }
            }
        }


        Stone nextStone = stones.get(idnexOfturtle + 1);
        if (nextStone.getName1() == null) {
            nextStone.setName1(turtle);
        } else if (nextStone.getName2() == null) {
            nextStone.setName2(turtle);
        } else if (nextStone.getName3() == null) {
            nextStone.setName3(turtle);
        } else if (nextStone.getName4() == null) {
            nextStone.setName4(turtle);
        } else if (nextStone.getName5() == null) {
            nextStone.setName5(turtle);
        }
    }
}
