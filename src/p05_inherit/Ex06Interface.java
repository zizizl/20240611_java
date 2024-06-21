package p05_inherit;

public class Ex06Interface {
  public static void main(String[] args) {
    Athlete athlete = new Athlete();
    System.out.println(athlete);
  }
}

// java에서는 다중상속이 안된다.그래서, interface를 사용한다.
class Athlete implements ISwim, IBicycle {
  @Override
  public void swim() {
    // 중복된 상수는 static 붙어 있기 때문에 클래스와 함께 지정
    System.out.println(ISwim.LEVEL);
  }

  @Override
  public void ride() {
    Triathlon.start(); // interface의 static메서드 호출
  }
}

// interface는 추상자료형. 반드시 class에서 implements후에 사용
// 목적: 클래스들이 구현해야 하는 동작을 보완하기 위해 사용
// 장점: 표준화가 가능
interface ISwim {
  //추상메서드와 상수만 정의(static, default 메서드 추가)
  public abstract void swim();

  public static final int LEVEL = 10;

}

interface IBicycle {
  void ride();

  int LEVEL = 20;
}

interface Triathlon extends ISwim, IBicycle {
  public default void complete() {
    swim();
    ride();
  }

  public static void start() {
    System.out.println("출발이다!");
  }
}