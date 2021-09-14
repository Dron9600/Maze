package kz.prudnikov.maze;

import java.util.LinkedList;
import java.util.List;

public class ListedMap implements IMap {

    private final List<XYPoint> map;
    private final XYPoint startPoint;
    private final XYPoint finishPoint;

    public ListedMap(LinkedList<XYPoint> map, XYPoint startPoint, XYPoint finishPoint) {
        this.map = map;
        this.startPoint = startPoint;
        this.finishPoint = finishPoint;
    }

    @Override
    public void createRandomMap() {
        // TODO make logic for random filling of map
    }

    @Override
    public void showMapInString() {
        // TODO make logic for string representation for map
    }

    public List<XYPoint> getListedMap() {
        return map;
    }

    public XYPoint getStartPoint() {
        return startPoint;
    }

    public XYPoint getFinishPoint() {
        return finishPoint;
    }

    public boolean checkPointForContains(IPoint point) {
        boolean result = false;
        try {
            result = map.contains((XYPoint) point);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

}


//    static int[][] Maze = {
//            {2, 0, 0, 1, 1, 0, 1, 1},
//            {1, 1, 1, 1, 1, 1, 1, 1},
//            {0, 0, 0, 1, 1, 0, 1, 0},
//            {0, 0, 0, 1, 1, 0, 1, 1},
//            {1, 1, 1, 1, 0, 1, 0, 1},
//            {0, 0, 0, 1, 1, 0, 1, 0}
//    };
//    static LinkedList<XYPoint> path = new LinkedList<XYPoint>();
//
//    public static void print() {
//        for (int i = 0; i < Maze.length; i++) {
//            for (int j = 0; j < Maze[i].length; j++) {
//                System.out.print(Maze[i][j] + " ");
//            }
//            System.out.println();
//        }
//        System.out.println("----------------");
//    }