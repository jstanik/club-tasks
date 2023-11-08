package bakeit.club.task;

public class FindClosestPoints {

  /**
   * Implements a method which goes through the array {@code points} and find two points which are
   * closest to each other.
   *
   * @param points the array of at least two points
   * @return the pair of points that are closest to each other
   */
  PointPair findClosestPoints(Point[] points) {
    if (points.length < 2) {
      throw new IllegalArgumentException("The length of the array 'points' has to be at least 2");
    }

    // TODO replace the following line with the logic
    throw new UnsupportedOperationException();
  }

}

class Point {

  double x;
  double y;

  Point(double x, double y) {
    this.x = x;
    this.y = y;
  }

  @Override
  public String toString() {
    return "[" + x + ", " + y + "]";
  }
}

class PointPair {

  Point p1;
  Point p2;

  PointPair(Point p1, Point p2) {
    this.p1 = p1;
    this.p2 = p2;
  }

  @Override
  public String toString() {
    return "PointPair{" +
        "p1=" + p1 +
        ", p2=" + p2 +
        '}';
  }
}
