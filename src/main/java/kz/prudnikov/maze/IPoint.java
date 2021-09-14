package kz.prudnikov.maze;

import kz.prudnikov.maze.utils.AndrewPair;

import java.util.List;

public interface IPoint {

    AndrewPair<Integer, Integer> getCoordinates();

    List<? extends IPoint> getNeighbourPoints();

}
