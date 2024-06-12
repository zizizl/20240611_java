package p02_variable;

import p01_class.Animal;

public class Ex02Types {
  //변수의 종류 크게: Primitive, Reference
  // Primitive type( 일반 변수는 실제 값을 가짐 )
  // Reference type( 참조형 변수, 주소 값을 가짐 )

  // 변수의 할당 = 선언 + 초기화
  // 멤버변수는 선언만 해도 됨 new 라는 생성연산자를 통해 기본값으로 초기화
  // 멤버변수가 할당이 된것은 new 에서 제외
  boolean power = true; // 할당
  char c1; // 선언
  byte b1;
  short s1;
  int i1;
  long l1;
  float f1;
  double d1;
  String str;
  Animal animal;

  public static void main(String[] args) {
    // 지역변수는 사용하기 위해서는 반드시 할당을 해야함
    boolean power = true; // 논리형 - true, false 값을 나타냄, 1byte
    char c1 = 'A';        // 문자형 - 2byte, 0~65535, 16비트, 문자 1개 밖에 안들어감 ex)Apple 안됌
    byte b1 = 18;         // 정수형 - 1byte, 8비트, -128~127
    short s1 = 10;        // 정수형 - 2byte, 16비트, -32,768 ~ 32,767
    int i1 = 10;          // 정수형 - 4byte, 32비트, -2,147,483,648 ~ 2,147,483,647
    long l1 = 10L;        // 정수형 - 8byte, 64비트, -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807
    float f1 = 0.1f;      // 실수형 - 4byte, 32비트, 소수점 7째자리 10^45승~10^38
    double d1 = 0.1d;     // 실수형 - 8byte, 64비트, 소수점 15째자리 10^-324~10^308


    String str = "Hello"; System.out.println(str);
    Animal animal = new Animal(); System.out.println(animal);
    System.out.println(c1);
    System.out.println(str);

    System.out.println("===============");
    // 전역변수를 사용하기 위해서는 클래스 인스턴스를 만들어야함
    Ex02Types ex02types = new Ex02Types();  //밑에 값은 기본값을 나타냄
    System.out.println(ex02types.power);  // false
    System.out.println(ex02types.c1);     // 공백
    System.out.println(ex02types.b1);     // 0
    System.out.println(ex02types.s1);     // 0
    System.out.println(ex02types.i1);     // 0
    System.out.println(ex02types.l1);     // 0
    System.out.println(ex02types.f1);     // 0.0
    System.out.println(ex02types.d1);     // 0.0
    System.out.println(ex02types.str);    // null
    System.out.println(ex02types.animal); // null
  }
}
