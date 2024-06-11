package p02_variable;

public class Ex01Location {
  //1. 변수의 선언 위치 : 전역, 지역
  int sum = 0; //멤버변수는 전역(global variable)
  //int sum = 1; //중복 선언되어서 에러 발생
  public void sum() {
    System.out.println("gobal:" + sum);
    int sum = 1; //지역(local variable)
    System.out.println("local:" + sum);
  }


  public static void main(String[] agrs){
    Ex01Location ex01 = new Ex01Location();
    System.out.println("s:" + ex01.sum);
    ex01.sum();
  }
}

