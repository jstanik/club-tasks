package bakeit.club.task;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IsOddTest {

  @Test
  void isOddReturnsTrue() {
   int value = Utils.randomInt(1, 100);

   if (value % 2 == 0) {
     value += 1;
   }

   IsOdd cut = new IsOdd();

   boolean actual = cut.isOdd(value);

   assertTrue(actual);
  }

  @Test
  void isOddReturnsFalse() {
    int value = Utils.randomInt(1, 100);

    if (value % 2 != 0) {
      value += 1;
    }

    IsOdd cut = new IsOdd();

    boolean actual = cut.isOdd(value);

    assertFalse(actual);
  }
}