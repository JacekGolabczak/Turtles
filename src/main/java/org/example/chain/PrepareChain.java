package org.example.chain;

import org.example.gameTortoise.Stone;

public class PrepareChain implements Moveable {

    public PrepareChain() {

        Moveable moveturtlefrom4to5 = new MoveTurtleFromFourthToFifth(null);
        Moveable moveturtlefrom3to4 = new MoveTurtleFromThirdToFourth(moveturtlefrom4to5);
        Moveable moveturtlefrom2to3 = new MoveTurtleFromSecondToThird(moveturtlefrom3to4);
        Moveable moveturtlefrom1to2 = new MoveTurtleFromFirstToSecond(moveturtlefrom2to3);

        this.startChain = moveturtlefrom1to2;

    }

    private Moveable startChain;

    @Override
    public void move(Stone stone) {
        startChain.move(stone);
    }
}
