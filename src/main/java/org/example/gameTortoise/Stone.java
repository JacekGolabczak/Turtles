package org.example.gameTortoise;

public class Stone {

    private Turtle turtle1;
    private Turtle turtle2;
    private Turtle turtle3;
    private Turtle turtle4;
    private Turtle turtle5;

    public Stone() {
    }

    public Stone(Turtle turtle1, Turtle turtle2, Turtle turtle3, Turtle turtle4, Turtle turtle5) {
        this.turtle1 = turtle1;
        this.turtle2 = turtle2;
        this.turtle3 = turtle3;
        this.turtle4 = turtle4;
        this.turtle5 = turtle5;
    }

    public Turtle getTurtle1() {
        return turtle1;
    }

    public void setTurtle1(Turtle turtle1) {
        this.turtle1 = turtle1;
    }

    public Turtle getTurtle2() {
        return turtle2;
    }

    public void setTurtle2(Turtle turtle2) {
        this.turtle2 = turtle2;
    }

    public Turtle getTurtle3() {
        return turtle3;
    }

    public void setTurtle3(Turtle turtle3) {
        this.turtle3 = turtle3;
    }

    public Turtle getTurtle4() {
        return turtle4;
    }

    public void setTurtle4(Turtle turtle4) {
        this.turtle4 = turtle4;
    }

    public Turtle getTurtle5() {
        return turtle5;
    }

    public void setTurtle5(Turtle turtle5) {
        this.turtle5 = turtle5;
    }

    @Override
    public String toString() {
        return "Stone{" +
                "turtle1=" + turtle1 +
                ", turtle2=" + turtle2 +
                ", turtle3=" + turtle3 +
                ", turtle4=" + turtle4 +
                ", turtle5=" + turtle5 +
                '}';
    }
}

