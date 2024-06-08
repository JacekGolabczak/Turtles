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

        stone.setName1(new Turtle());
        stone.setName2(new Turtle());
        stone.setName3(new Turtle());
        stone.setName4(new Turtle());
        stone.setName5(new Turtle());

        stone.getName1().setColour(Colours.ORANGE);
        stone.getName2().setColour(Colours.BLUE);
        stone.getName3().setColour(Colours.RED);
        stone.getName4().setColour(Colours.WHITE);
        stone.getName5().setColour(Colours.BLACK);

//        Stone stone1 = new Stone(new Turtle(),new Turtle(),new Turtle(),new Turtle(),new Turtle());
//        stones.remove(stone);
        return board;
    }

}
