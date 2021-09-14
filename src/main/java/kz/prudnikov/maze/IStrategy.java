package kz.prudnikov.maze;

import java.util.LinkedList;
import java.util.List;

public interface IStrategy {

    public List<? extends IPoint> findTheWay(IMap map);

    public LinkedList<? extends IPoint> returnWay();

}
