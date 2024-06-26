package p07_Collection;

import java.util.Comparator;
import java.util.TreeSet;

public class Ex07TreeSet {
  public static void main(String[] args) {
    // treeset 정렬되는 기능을 가짐
    // 정렬될 수 있는 값들만 받음
    TreeSet set = new TreeSet();
    set.add(new Ball(4));
    set.add(new Ball(1));
    set.add(new Ball(3));
    System.out.println(set);
  }
}

class Ball implements Comparable {
  private int num;

  public Ball(int num) {
    this.num = num;
  }

  @Override
  public int compareTo(Object o) {
    if (o instanceof Ball) {
      Ball b = (Ball) o;
      // 뺄때 0이면 같다, 음수 작다, 양수 크다
      return num - b.num;
//      return -(num - b.num); 얘는 역순으로
    }
    return 0;
  }

  @Override
  public String toString() {
    return num + " ";
  }
}
