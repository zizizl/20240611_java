package p05_inherit;

public class Ex09Abstract {
  public static void main(String[] args) {
// abstract 추상클래스 스스로 인스턴스가 안됌( 추상클래스랑 인터페이스
  }
}

// 공통(표준)으로 사용하지만 인스턴스 생성불가
abstract class Abstract {
  int num = 10;
// 추상메서드 사용할 경우 반드시 abstract붙일것
  abstract void special();
}

interface Interface {

}

