package p06_javalang;

public class Ex02StringBuffer {
  public static void main(String[] args) {
    // String 이 문자열에 대한 확장이
    StringBuffer sb = new StringBuffer("hello");
    System.out.println(sb.hashCode());
    System.out.println(sb.length());
    System.out.println(sb.capacity());
    sb.append(" world");
    System.out.println(sb);
    System.out.println(System.identityHashCode(sb));
    System.out.println(sb.delete(4,6));
    System.out.println(sb.insert(4, "|"));
    System.out.println(sb.reverse());

  }
}
