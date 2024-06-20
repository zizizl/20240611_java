package p05_inherit;

import java.lang.reflect.Constructor;

public class Ex02object {
  public static void main(String[] args) {
    Member m1 = new Member("LSR", "1010101010");
    String str = new String("hello");
    System.out.println(m1);
    System.out.println(str);
    System.out.println(m1 instanceof Object);
    System.out.println(m1 instanceof Member);
  }
}

// 모든 클래스는 object를 상속받음
class Member {
  String name, mobile;

  public Member(String name, String mobile) {
    this.name = name;
    this.mobile = mobile;
  }

  @Override
  public String toString() {
    return String.format("name : %s, mobile : %s", name, mobile);
  }
}

class Phone {
}

class Computer {
}

// Java는 다중상속 허용하지 않음 명확하기 때문에
//class SmartPhone extends Phone, Computer