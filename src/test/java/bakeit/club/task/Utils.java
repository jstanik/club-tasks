package bakeit.club.task;

import java.security.SecureRandom;

public class Utils {

  private static final SecureRandom RANDOM = new SecureRandom();

  public static int randomInt() {
    return RANDOM.nextInt();
  }

  public static int randomInt(int max) {
    return RANDOM.nextInt(max + 1);
  }

  public static int randomInt(int min, int max) {
    return RANDOM.nextInt(min, max + 1);
  }

  public static double randomDouble() {
    return RANDOM.nextDouble();
  }

  public static double randomDouble(int max) {
    return RANDOM.nextDouble(max + 1);
  }

  public static double randomDouble(int min, int max) {
    return RANDOM.nextDouble(min, max + 1);
  }
}
