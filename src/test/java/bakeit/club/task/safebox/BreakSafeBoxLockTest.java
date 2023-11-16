package bakeit.club.task.safebox;

import static bakeit.club.task.safebox.BreakSafeBoxLock.ALPHABETH;
import static org.junit.jupiter.api.Assertions.assertEquals;

import bakeit.club.task.Utils;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class BreakSafeBoxLockTest {

  @Test
  void breakLock() {
    BreakSafeBoxLock cut = new BreakSafeBoxLock();

    int[] lettersAsInt = new int[BreakSafeBoxLock.KEY_SIZE];
    Arrays.setAll(lettersAsInt, i -> ALPHABETH[Utils.randomInt(0, ALPHABETH.length - 1)]);

    char[] letters = new char[lettersAsInt.length];
    for (int i = 0; i < lettersAsInt.length; i++) {
      letters[i] = (char) lettersAsInt[i];
    }

    String key = new String(letters);

    System.out.println("Key: " + key);

    SafeBox safeBox = new SafeBox();
    safeBox.lock(key);

    String actual = cut.breakLock(safeBox);

    assertEquals(key, actual);
  }
}