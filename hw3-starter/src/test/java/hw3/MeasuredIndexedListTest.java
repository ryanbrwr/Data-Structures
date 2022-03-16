package hw3;

import hw3.list.MeasuredIndexedList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MeasuredIndexedListTest {

  private static final int LENGTH = 15;
  private static final int DEFAULT_VALUE = 3;

  private MeasuredIndexedList<Integer> measuredIndexedList;

  @BeforeEach
  void setup() {
    measuredIndexedList = new MeasuredIndexedList<>(LENGTH, DEFAULT_VALUE);
  }

  @Test
  @DisplayName("MeasuredIndexedList starts with zero reads")
  void zeroReadsStart() {
    assertEquals(0, measuredIndexedList.accesses());
  }

  @Test
  @DisplayName("MeasuredIndexedList starts with zero writes")
  void zeroWritesStart() {
    assertEquals(0, measuredIndexedList.mutations());
  }

  @Test
  @DisplayName("MeasuredIndexedList has the correct length")
  void correctLength() {
    assertEquals(LENGTH, measuredIndexedList.length());
  }

  @Test
  @DisplayName("Put value at index 0 works")
  void putValueAtIndex0() {
    measuredIndexedList.put(0, 1);
    assertEquals(1, measuredIndexedList.get(0));
  }

  @Test
  @DisplayName("Put value at index 1 more than LENGTH throws error")
  void putValueAtIndex1MoreThanLengthThrowsError() {
    try {
      measuredIndexedList.put(LENGTH + 1, 1);
      fail("Expected IndexOutOfBoundsException");
    } catch (IndexOutOfBoundsException e) {
      // expected
    }
  }

  @Test
  @DisplayName("Count works after put")
  void countAfterPut() {
    measuredIndexedList.put(0, 1);
    assertEquals(1, measuredIndexedList.count(1));
  }

  @Test
  @DisplayName("Count works after put")
  void countAfterPut2() {
    measuredIndexedList.put(0, 1);
    measuredIndexedList.put(1, 1);
    assertEquals(2, measuredIndexedList.count(1));
  }

  @Test
  @DisplayName("Count works after put")
  void countAfterPut3() {
    measuredIndexedList.put(0, 1);
    measuredIndexedList.put(1, 1);
    measuredIndexedList.put(2, 1);
    assertEquals(3, measuredIndexedList.count(1));
  }

  @Test
  @DisplayName("Get works after put")
  void getAfterPut() {
    measuredIndexedList.put(0, 1);
    assertEquals(1, measuredIndexedList.get(0));
  }

  @Test
  @DisplayName("Get works after put")
  void getAfterPut2() {
    measuredIndexedList.put(0, 1);
    measuredIndexedList.put(1, 1);
    assertEquals(1, measuredIndexedList.get(0));
  }

  @Test
  @DisplayName("Get works after put")
  void getAfterPut3() {
    measuredIndexedList.put(0, 1);
    measuredIndexedList.put(1, 1);
    measuredIndexedList.put(2, 1);
    assertEquals(1, measuredIndexedList.get(0));
  }

  @Test
  @DisplayName("Get works after put")
  void getAfterPut4() {
    measuredIndexedList.put(0, 1);
    measuredIndexedList.put(1, 1);
    measuredIndexedList.put(2, 1);
    assertEquals(1, measuredIndexedList.get(1));
  }

  @Test
  @DisplayName("Get works after put")
  void getAfterPut5() {
    measuredIndexedList.put(0, 1);
    measuredIndexedList.put(1, 1);
    measuredIndexedList.put(2, 1);
    assertEquals(1, measuredIndexedList.get(2));
  }

  @Test
  @DisplayName("Get works after put")
  void getAfterPut6() {
    measuredIndexedList.put(0, 1);
    measuredIndexedList.put(1, 1);
    measuredIndexedList.put(2, 1);
    assertEquals(1, measuredIndexedList.get(3));
  }

  @Test
  @DisplayName("Get LENGTH + 1 throws error")
  void getLENGTHPlus1ThrowsError() {
    try {
      measuredIndexedList.get(LENGTH + 1);
      fail("Expected IndexOutOfBoundsException");
    } catch (IndexOutOfBoundsException e) {
      // expected
    }
  }
}
