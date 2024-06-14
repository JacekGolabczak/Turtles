package org.example.configClass;

import org.example.gameTortoise.Board;
import org.example.gameTortoise.Colours;
import org.example.gameTortoise.Stone;
import org.example.gameTortoise.Turtle;

import java.util.List;

public class PrepareStone {

    public static Board prepareBoard() {

        Board board = new Board();

        List<Stone> stones = board.getStone();

        Stone stone = stones.get(0);

        stone.setTurtle1(new Turtle());
        stone.setTurtle2(new Turtle());
        stone.setTurtle3(new Turtle());
        stone.setTurtle4(new Turtle());
        stone.setTurtle5(new Turtle());

        stone.getTurtle1().setColour(Colours.ORANGE);
        stone.getTurtle2().setColour(Colours.BLUE);
        stone.getTurtle3().setColour(Colours.RED);
        stone.getTurtle4().setColour(Colours.WHITE);
        stone.getTurtle5().setColour(Colours.BLACK);

//        Stone stone1 = new Stone(new Turtle(),new Turtle(),new Turtle(),new Turtle(),new Turtle());
//        stones.remove(stone);
        return board;
    }

}
