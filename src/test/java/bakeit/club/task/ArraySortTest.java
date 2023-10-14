package bakeit.club.task;

import static bakeit.club.task.Utils.randomInt;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class ArraySortTest {

  @Test
  void sort() {

    int[] array = new int[10];

    for (int i = 0; i < array.length; i++) {
      array[i] = randomInt();
    }

    ArraySort cut = new ArraySort();
    cut.sort(array);

    for (int i = 0; i < array.length - 1; i++) {
      int index = i;
      assertTrue(array[i] <= array[i + 1],
          () -> "array[" + index + "]=" + array[index] + " is greater than array[" + (index + 1)
              + "]=" + array[index + 1]);
    }
  }
}