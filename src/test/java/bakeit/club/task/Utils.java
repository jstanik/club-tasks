package bakeit.club.task;

import java.security.SecureRandom;

class Utils {

  private static final SecureRandom RANDOM = new SecureRandom();

  static int randomInt() {
    return RANDOM.nextInt();
  }

  static int randomInt(int max) {
    return RANDOM.nextInt(max + 1);
  }

  static int randomInt(int min, int max) {
    return RANDOM.nextInt(min, max + 1);
  }

  static double randomDouble() {
    return RANDOM.nextDouble();
  }

  static double randomDouble(int max) {
    return RANDOM.nextDouble(max + 1);
  }

  static double randomDouble(int min, int max) {
    return RANDOM.nextDouble(min, max + 1);
  }
}
