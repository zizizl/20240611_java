package p03_method;

public class Ex04CallByValue {
  static void change(int value) {
    value = 1000;
  }

  static void change(Data data) {
    data.value = 1000;
    System.out.println("change: " + data);
  }

  public static void main(String[] args) {
    String st; //선언만 할 경우 참조형변수의 구조만 설정됨
    // System.out.println(st); // 초기화가 안되어서 에러
    String str = "hello";
    System.out.println(str);
    Data d = new Data();
    System.out.println("main:   " + d);
    d.value = 100;
    System.out.println(d.value);
    change(500);//4번 라인 호출
    change(d.value); //4번 라인 호출
    change((int) 1.12f); //4번 기본형타입의 명시적 형변환
    change(d);       //5번 라인 호출
    System.out.println(d.value);
  }
}


class Data {
  int value;

}
