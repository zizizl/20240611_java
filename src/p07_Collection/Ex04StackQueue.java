package p07_Collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Vector;

public class Ex04StackQueue {
  public static void main(String[] args) {
    Stack stack = new Stack();
    stack.push(0);
    stack.push(1);
    stack.push(2);
    System.out.println(stack);
    System.out.println(stack.size());
    System.out.println(stack.contains(1));
    System.out.println(stack.pop());
    System.out.println(stack.peek());
    System.out.println(stack);
    System.out.println(stack.empty());

    Queue q = new LinkedList();
    q.offer("a");
    q.offer("b");
    q.offer("c");
    System.out.println(q);
    System.out.println(q.poll());
    System.out.println(q.peek());
    System.out.println(q);

    // 컬렉션 이전에 나온 버전
    Vector v = new Vector();


  }
}
