package hw3.list;

import exceptions.IndexException;

/**
 * An ArrayIndexedList that is able to report the number of
 * accesses and mutations, as well as reset those statistics.
 *
 * @param <T> The type of the array.
 */
public class MeasuredIndexedList<T> extends ArrayIndexedList<T> implements Measured<T> {
  private int mutations;
  private int accesses;
  /**
   * Constructor for a MeasuredIndexedList.
   *
   * @param size         The size of the array.
   * @param defaultValue The initial value to set every object to in the array..
   */

  public MeasuredIndexedList(int size, T defaultValue) {
    super(size, defaultValue);
    accesses = 0;
    mutations = 0;
  }

  @Override
  public int length() {
    return super.length();
  }

  @Override
  public T get(int index) throws IndexException {
    T value = super.get(index);
    accesses++;
    return value;
  }

  @Override
  public void put(int index, T value) throws IndexException {
    super.put(index, value);
    mutations++;
  }

  @Override
  public void reset() {
    mutations = 0;
    accesses = 0;
  }

  @Override
  public int accesses() {
    return accesses;
  }

  @Override
  public int mutations() {
    return mutations;
  }

  // Count the number of times the value appears in the list.
  @Override
  public int count(T value) {
    int count = 0;
    for (int i = 0; i < length(); i++) {
      if (get(i).equals(value)) {
        count++;
      }
    }
    return count;
  }
}
