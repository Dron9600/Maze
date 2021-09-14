package kz.prudnikov.maze;

import kz.prudnikov.maze.utils.AndrewPair;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class XYPoint implements IPoint {

    private final Integer xCoordinate;
    private final Integer yCoordinate;

    public XYPoint(int x, int y) {
        this.xCoordinate = x;
        this.yCoordinate = y;
    }

    @Override
    public AndrewPair<Integer, Integer> getCoordinates() {
        return new AndrewPair<>(xCoordinate, yCoordinate);
    }

    @Override
    public List<XYPoint> getNeighbourPoints() {
        return new ArrayList<>(Arrays.asList(
                new XYPoint(this.xCoordinate - 1, this.yCoordinate),
                new XYPoint(xCoordinate, yCoordinate - 1),
                new XYPoint(xCoordinate + 1, yCoordinate),
                new XYPoint(xCoordinate, yCoordinate + 1)
        ));
    }

}
