package bakeit.club.task.safebox;


import javax.swing.text.AbstractDocument.BranchElement;

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

    int[] configuration = new int[KEY_SIZE];

    boolean searchCompleted = false;
    while(!searchCompleted) {

    }

    return null;
  }

  private boolean isFinal(int[] configuration) {

  }

  private void next(int[] configuration) {

  }

  private String toKey(int[] configuration) {

  }

}

