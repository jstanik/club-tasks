package bakeit.club.task;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class IsPrimeTest {

  IsPrime cut = new IsPrime();


  @ParameterizedTest
  @ValueSource(ints = {2, 3, 5, 7, 227, 229, 233, 239, 241, 251, 257,
      263, 269, 271, 277, 281, 283, 293})
  void isPrime_isTrue(int prime) {
    assertTrue(cut.isPrime(prime));
  }

  @Test
  void isPrime_false() {
    assertFalse(cut.isPrime(4));
    assertFalse(cut.isPrime(6));
    assertFalse(cut.isPrime(8));
    assertFalse(cut.isPrime(9));
    assertFalse(cut.isPrime(10));
    assertFalse(cut.isPrime(81));
  }

}