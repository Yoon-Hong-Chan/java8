package me.whiteship.java8to11;

public enum Direction {
    EAST(1,">"),
    SOUTH(2,"v"),
    WEST(3,"<"),
    NORTH(4,"^");

    private int value;
    private String symbol;
    Direction(int i, String s) {
        value = i;
        symbol = s;
    }

    public int getValue() {
        return value;
    }

    public String getSymbol() {
        return symbol;
    }
}
