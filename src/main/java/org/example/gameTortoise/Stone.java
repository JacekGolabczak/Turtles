package org.example.gameTortoise;

public class Stone {

    private Turtle name1;
    private Turtle name2;
    private Turtle name3;
    private Turtle name4;
    private Turtle name5;

    public Stone(){

    }

    public Stone(Turtle name1, Turtle name2, Turtle name3, Turtle name4, Turtle name5) {
        this.name1 = name1;
        this.name2 = name2;
        this.name3 = name3;
        this.name4 = name4;
        this.name5 = name5;
    }



    public Turtle getName1() {
        return name1;
    }

    public void setName1(Turtle name1) {
        this.name1 = name1;
    }

    public Turtle getName2() {
        return name2;
    }

    public void setName2(Turtle name2) {
        this.name2 = name2;
    }

    public Turtle getName3() {
        return name3;
    }

    public void setName3(Turtle name3) {
        this.name3 = name3;
    }

    public Turtle getName4() {
        return name4;
    }

    public void setName4(Turtle name4) {
        this.name4 = name4;
    }

    public Turtle getName5() {
        return name5;
    }

    public void setName5(Turtle name5) {
        this.name5 = name5;
    }

    @Override
    public String toString() {
        return "Stone{" +
                "name1=" + name1 +
                ", name2=" + name2 +
                ", name3=" + name3 +
                ", name4=" + name4 +
                ", name5=" + name5 +
                '}';
    }
}
