package p01_class;

public class Animal {
  /*
클래스 선언할 경우
1) 멤버변수와 메서드가 없어도 클래스 선언 가능
2) 멤버변수와 메서드를 사용하려고 하면 반드시 클래스를 선언
3) 파일명과 일치하는 클래스에만 class에 public 사용 가능
4) 클래스는 new(생성 연산자 이름)를 통해 인스턴스로 만들어야 함
5) 클래스는 new를 통해 인스턴스를 생성할 수 있음
 */

  public int legs;
  String color;

  public void run() {
    System.out.println(legs);
  }
}
