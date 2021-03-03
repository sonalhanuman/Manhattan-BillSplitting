public class ManhattanSonal {
    public int convertDistance (Point point1, Point point2) {
        int x1 = point1.getX();
        int y1 = point1.getY();
        int x2 = point2.getX();
        int y2 = point2.getY();
        int d = Math.abs(x1 - x2) + Math.abs(y1 - y2);
        return d;
    }
}
