package bakeit.club.task.safebox;

public class SafeBox {

  private String secret;
  private boolean locked;
  private String key;

  public String retrieve() {
    validateUnlocked();
    return secret;
  }

  public void store(String secret) {
    validateUnlocked();
    this.secret = secret;
  }

  public void lock(String key) {
    this.locked = true;
    this.key = key;
  }

  public boolean unlock(String key) {
    if (this.key.equals(key)) {
      locked = false;
    }

    return !locked;
  }

  private void validateUnlocked() {
    if (locked) {
      throw new IllegalStateException("Cannot access the safe-box because it is locked");
    }
  }
}
