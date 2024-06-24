package p05_inherit;

public class Ex10Modifier {
  public static void main(String[] args) {
    FinalClass finalClass = new FinalClass();
    System.out.println(finalClass);
  }
}

// 클래스 앞에 final이 붙었을 때는 상속이 안됨
final class FinalClass {
}


