package bakeit.club.task.safebox;

import static org.junit.jupiter.api.Assertions.*;

import bakeit.club.task.Utils;
import org.junit.jupiter.api.Test;

class BreakSafeBoxLockTest {

  @Test
  void breakLock() {
    char[] keyChars = new char[BreakSafeBoxLock.KEY_SIZE];

    for (int i = 0; i < keyChars.length; i++) {
      keyChars[i] = BreakSafeBoxLock.ALPHABETH[
          Utils.randomInt(0, BreakSafeBoxLock.ALPHABETH.length - 1)
          ];
    }

    SafeBox box = new SafeBox();
    box.store("Top secret");

    String key = new String(keyChars);
    box.lock(key);

    var cut= new BreakSafeBoxLock();
    String actual = cut.breakLock(box);
    assertEquals(key, actual);
  }

}