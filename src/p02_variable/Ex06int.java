package p02_variable;

import common.Utils;

public class Ex06int {
  public static void main(String[] args) {
    byte b1 = 100;
//    byte b2 = 200;
    byte b3 = 100;
//    byte b4 = b1 + b3; 200이 넘어서 error
    System.out.println(b1 + b3);
    byte b4 = (byte) (b1 + b3);
    Utils.typeOf(b4);
    System.out.println(b4);
// boolean 제외한 4byte 이하 자료형은 int로 변환후 연산
    short s1 = 1000;
    short s2 = 1000;
    short s3 = (short) (s1 + s2);
    System.out.println(s3);
    int i1 = s1 + s2;
    System.out.println(i1);

    long l1 = 200l; // long = long
    long l2 = 200;  // long = int   longl2 = (long)200 이렇게 표현한건데 long이 생략되서 표시됨. 묵시적 형변환


  }
}