package p02_variable;

public class Ex04boolean {
  public static void main(String[] args) {
    Tv tv;
    tv = new Tv();
    System.out.println(tv);
    tv.power();
    tv.power();
    tv.channelUp();
    tv.channelUp();
    tv.channelUp();
    tv.channelDown();
    tv.channelDown();
    tv.channelDown();
    tv.volumeup();
    tv.volumeup();
    tv.volumeup();
    tv.volumeDown();
    tv.volumeDown();
    tv.volumeDown();

  }
}

class Tv {
  boolean power;
  int channel;
  int volume;

  void power() {
//    1.
//    if (power == false) {
//      power = true;
//    } else {
//      power = false;
//    }
//    if (power == true) {
//      System.out.println("Tv 전원이 켜졌습니다.");
//    } else {
//      System.out.println("Tv 전원이 꺼졌습니다.");
//    }

//    2.
//    if (power == false) {
//      power = true;
//      System.out.println("Tv 전원이 켜졌습니다.");
//    } else {
//      power = false;
//      System.out.println("Tv 전원이 꺼졌습니다.");
//    }

//    3.
    power = !power;
    System.out.println(power ? "전원 ON" : "전원 Off");
  }

  void channelUp() {
//    channel++; 밑에는 다 같은 값
//    channel = channel + 1;
//    channel += 1;
//    channel++;
    System.out.println(++channel);
  }

  void channelDown() {
    System.out.println(--channel);
  }

  void volumeup() {
    System.out.println(++volume);
  }

  void volumeDown() {
    System.out.println(--volume);
  }


}