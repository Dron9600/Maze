package kz.prudnikov.maze;

import java.util.Arrays;
import java.util.LinkedList;

public class Maze {

    public static void main(String[] args) {

        XYPoint startPoint = new XYPoint(10, 0);
        XYPoint finishPoint = new XYPoint(0, 8);
        LinkedList<XYPoint> listedMap = new LinkedList<>(Arrays.asList(
                new XYPoint(0, 0),
                new XYPoint(1, 0),
                new XYPoint(2, 0),
                new XYPoint(3, 0),
                new XYPoint(4, 0),
                new XYPoint(5, 0),
                new XYPoint(5, 1),
                new XYPoint(5, 2),
                new XYPoint(6, 2),
                new XYPoint(7, 2),
                new XYPoint(7, 1),
                new XYPoint(7, 0),
                new XYPoint(8, 0),
                new XYPoint(9, 0),
                new XYPoint(10, 0),
                new XYPoint(2, 1),
                new XYPoint(2, 2),
                new XYPoint(2, 3),
                new XYPoint(1, 3),
                new XYPoint(0, 3),
                new XYPoint(2, 4),
                new XYPoint(2, 5),
                new XYPoint(2, 6),
                new XYPoint(3, 6),
                new XYPoint(4, 6),
                new XYPoint(4, 7),
                new XYPoint(4, 8),
                new XYPoint(3, 8),
                new XYPoint(2, 8),
                new XYPoint(1, 8),
                new XYPoint(0, 8)
        ));

        IMap map = new ListedMap(listedMap, startPoint, finishPoint);
        IStrategy strategy = new AndrewStrategy(); // you can use ArturStrategy instead for example
        strategy.findTheWay(map);

    }

}
