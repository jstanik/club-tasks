package bakeit.club.task;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import org.junit.jupiter.api.Test;

class FindMaxTest {

  @Test
  void findMax() {

    int[] values = new int[10];
    AtomicInteger max = new AtomicInteger(Integer.MIN_VALUE);
    Arrays.setAll(values, i -> {
      int generated = Utils.randomInt(0, 100);
      int currentMax = max.get();
      if (currentMax < generated) {
        max.set(generated);
      }
      return generated;
    });

    FindMax cut = new FindMax();
    double actual = cut.findMax(values);

    assertEquals(max.get(), actual);
  }
}