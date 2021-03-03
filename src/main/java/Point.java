/*Rules
The class Point is immutable (its state cannot be changed after instantiation)
The class Point has no Getters
The class Point has no public properties (i.e. the internal state cannot be read from outside the class).*/

/*Manhattan Distance
        Manhattan distance is the distance between two points in a grid (like the grid-like street
        geography of the New York borough of Manhattan) calculated by only taking a vertical and/or horizontal path.

        Write a function int manhattanDistance(Point, Point) that returns the Manhattan Distance between the two points.

        Rules
        The class Point is immutable (its state cannot be changed after instantiation)
        The class Point has no Getters
        The class Point has no public properties (i.e. the internal state cannot be read from outside the class).*/


public class Point {
    private int y;
    private int x;

    public Point (int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }
}
