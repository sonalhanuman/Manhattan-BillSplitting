import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManhattanSonalTest {
    @Test
    public void manhattan_1_1_and_5_5() {
        Point point1 = new Point(1, 1);
        Point point2 = new Point(5, 5);
        ManhattanSonal mDistance = new ManhattanSonal();
        assertEquals(8, mDistance.convertDistance(point1, point2));
    }

    @Test
    public void manhattan_10_10_and_5_5() {
        Point point1 = new Point(10, 10);
        Point point2 = new Point(5, 5);
        ManhattanSonal mDistance = new ManhattanSonal();
        assertEquals(10, mDistance.convertDistance(point1, point2));
    }
}