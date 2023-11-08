package bakeit.club.task;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

class FindClosestPointsTest {


  @Test
  void findClosestPoints() {
    int pointCount = Utils.randomInt(4, 20);

    Point[] points = new Point[pointCount];
    for (int i = 0; i < points.length; i++) {
      points[i] = new Point(Utils.randomDouble(0, 10), Utils.randomDouble(0, 10));
    }

    FindClosestPoints cut = new FindClosestPoints();

    PointPair actual = cut.findClosestPoints(points);

    List<PointPair> expected = possibleResults(points);

    assertTrue(expected.stream().anyMatch(pair ->
        (pair.p1 == actual.p1 && pair.p2 == actual.p2)
            || (pair.p2 == actual.p1 && pair.p1 == actual.p2)));
  }

  private List<PointPair> possibleResults(Point[] points) {
    List<PointPair> pairs = new ArrayList<>();

    double shortestDistance = Double.MAX_VALUE;

    for (int i = 0; i < points.length - 1; i++) {
      for (int j = i + 1; j < points.length ; j++) {
        PointPair pair = new PointPair(points[i], points[j]);
        double distance = distance(pair);
        if (distance < shortestDistance) {
          pairs.clear();
          pairs.add(pair);
          shortestDistance = distance;
        } else if( distance == shortestDistance) {
          pairs.add(pair);
        }
      }
    }

    return pairs;
  }

  private double distance(PointPair pair) {
    double deltaX = pair.p1.x - pair.p2.x;
    double deltaY = pair.p1.y - pair.p2.y;

    return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
  }
}