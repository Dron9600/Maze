package kz.prudnikov.maze;

public interface IMap {

    public void createRandomMap();

    public void showMapInString();

    public IPoint getStartPoint();

    public IPoint getFinishPoint();

    public boolean checkPointForContains(IPoint point);

}
