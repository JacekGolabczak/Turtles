package org.example;

import org.example.Service.MoveTurtleService;
import org.example.configClass.PrepareStone;
import org.example.gameTortoise.*;

public class Main {
    public static void main(String[] args) {

//        Turtle Ronealdo = new Turtle();
//        Turtle Jackson = new Turtle();
//        Turtle Moreno = new Turtle();
//        Turtle Varedo = new Turtle();
//        Turtle Michael = new Turtle();

//        Ronealdo.setColour(Colours.WHITE);
//        Jackson.setColour(Colours.RED);
//        Moreno.setColour(Colours.BLACK);
//        Varedo.setColour(Colours.BLUE);
//        Michael.setColour(Colours.ORANGE);
//
//        Stone stone = new Stone();
//
//        stone.setName1(Ronealdo);
//        stone.setName2(Jackson);
//        stone.setName3(Moreno);
//        stone.setName4(Varedo);
//        stone.setName5(Michael);
//
//        Card card1 = new Card(Colours.BLACK, Move.MINUS_ONE);
//        Card card2 = new Card(Colours.WHITE, Move.PLUS_ONE);
//        Card card3 = new Card(Colours.ORANGE, Move.PLUS_TWO);

//        for (int i = 0; i < 10; i++) {
//            Stone s = board.getStones2().get(i);
//            System.out.println(s
        Board board = PrepareStone.prepareBoard();

        MoveTurtleService moveTurtleService = new MoveTurtleService();

        Card card1 = new Card(Colours.BLUE, Move.PLUS_ONE);
        Card card2 = new Card(Colours.BLACK, Move.PLUS_ONE);
        Card card3 = new Card(Colours.RED, Move.PLUS_ONE);
        Card card4 = new Card(Colours.ORANGE, Move.PLUS_ONE);
        Card card5 = new Card(Colours.WHITE, Move.PLUS_ONE);

        moveTurtleService.move(card1, board.getStone());
        moveTurtleService.move(card2, board.getStone());
        moveTurtleService.move(card3, board.getStone());
        moveTurtleService.move(card4, board.getStone());
        moveTurtleService.move(card5, board.getStone());

        printedboard(board);

    }

    private static void printedboard(Board board) {
        for (Stone s : board.getStone()) {
            System.out.println(s);
        }
    }
}
