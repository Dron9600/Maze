package kz.prudnikov.maze.utils;

public class AndrewPair<A, B> {

    private A aValue = null;
    private B bValue = null;

    public AndrewPair() {

    }

    public AndrewPair(A aValue, B bValue) {
        this.aValue = aValue;
        this.bValue = bValue;
    }

    public A getAValue() {
        return aValue;
    }

    public B getBValue() {
        return bValue;
    }

}
