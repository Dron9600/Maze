package kz.prudnikov.maze;

import java.util.LinkedList;

public class AndrewStrategy implements IStrategy {

    public AndrewStrategy() {

    }

    @Override
    public LinkedList<XYPoint> findTheWay(IMap map) {
        IPoint startPoint = map.getStartPoint();
        startPoint.getNeighbourPoints().forEach(psblPnt -> {
            if (map.checkPointForContains(psblPnt)) {

            } else {

            }
        });
        return null;
    }

    @Override
    public LinkedList<? extends IPoint> returnWay() {
        return null;
    }

}
