package bakeit.club.task.safebox;

public class BreakSafeBoxLock {

  public static char[] ALPHABETH = {'a', 'b', 'c', 'd', '!', '$', '#', '@', '^', '*', '&'};
  public static int KEY_SIZE = 8;

  /**
   * Break the lock by finding the safeBoxes key.
   *
   * @param safeBox the safebox to unlock
   * @return the key for unlocking the safebox
   */
  public String breakLock(SafeBox safeBox) {

    int[] keyConfiguration = new int[KEY_SIZE];

    boolean searchCompleted = false;
    while (!searchCompleted) {
      String key = toKey(keyConfiguration);

      if (safeBox.unlock(key)) {
        return key;
      }

      if (isFinal(keyConfiguration)) {
        searchCompleted = true;
      } else {
        next(keyConfiguration);
      }
    }

    return null;
  }

  private String toKey(int[] configuration) {
    char[] characters = new char[configuration.length];
    for (int i = 0; i < configuration.length; i++) {
      characters[i] = ALPHABETH[configuration[i]];
    }

    return new String(characters);
  }

  private void next(int[] configuration) {
    for (int i = 0; i < configuration.length; i++) {
      int value = configuration[i] + 1;
      if (value < ALPHABETH.length) {
        configuration[i] = value;
        break;
      } else {
        configuration[i] = 0;
      }
    }
  }

  private boolean isFinal(int[] configuration) {
    int finalIndex = ALPHABETH.length - 1;

    for (int i = 0; i < configuration.length; i++) {
      if (configuration[i] != finalIndex) {
        return false;
      }
    }

    return true;
  }
}
