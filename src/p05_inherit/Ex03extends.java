package p05_inherit;

public class Ex03extends {
  public static void main(String[] args) {
    Marine marine = new Marine();
    System.out.println(marine);
    Medic medic = new Medic();
    System.out.println(medic);
  }
}

// abstract는 추상 클래스 : 스스로 인스턴스 생성이 불가, 상속받은 후에 사용
abstract class Unit {
  public Unit(String tribe, String name, int hp) {
    super();
    this.tribe = tribe;
    this.name = name;
    this.hp = hp;
  }

  String tribe;
  String name;
  int hp;

  public void move(int x, int y) {
  }

  public void stop() {
  }

  @Override
  public String toString() {
    return String.format("tribe=%s, name=%s, hp=%d", tribe, name, hp);
  }
}

abstract class Protoss extends Unit {
  // 상속할 경우에는 Member변수와 method만 상속
  public Protoss(String name, int hp) {
    super("Protoss",name, hp);
  }
}

abstract class Terran extends Unit {
  // 상속할 경우에는 Member변수와 method만 상속
  public Terran(String name, int hp) {
    super("Terran", name, hp);
  }
}

class Marine extends Terran {
  public Marine() {
    super("Marine", 60);
  }
}

class Medic extends Terran {
  public Medic() {
    super("Medic", 45);
  }
}