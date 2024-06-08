package org.example.gameTortoise;

public enum Move {

    PLUS_ONE(1, "MOVE +1"),
    MINUS_ONE(-1, "BACK -1"),
    PLUS_TWO(2, "MOVE +2"),
    ;

    private final int value;
    private final String msg;

    Move(int value, String msg) {
        this.value = value;
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public int getValue() {
        return value;
    }
}
