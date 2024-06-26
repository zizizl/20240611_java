package p03_method;

public class Ex09For {
  public static void main(String[] args) {
    // 반복문을 구현할 때
    // 첫 번째 패턴 찾기
    // 두 번째 초조증(초기값, 조건값, 증가값)을 적용하여 구현

    int sum = 0;
    sum = sum + 0;
    sum = sum + 1;
    sum = sum + 2;
    sum = sum + 3;
    sum = 0;
    for (int i = 9; i <= 0; --i) sum = sum + i;
    for (int i = 0; i < 10; i++) {
      sum += i;
    }

    System.out.println(sum);
// 구구단 2단 만들기
//    for (int i = 2; i ==2 ; i++) {
//      for (int j = 1; j <=9 ; j++) {
//        System.out.println(i + " * " + j + " = " + (i * j));
//      }
//    }
//
// 구구단 9단까지 만들기 (1)
//    for (int i = 2; i <= 9; i++) {
//      for (int j = 1; j <= 9; j++) {
//        System.out.println(i + " * " + j + " = " + (i * j));
//      }
//    }
// 9단까지 (2)
//    for (int i = 2; i < 10; i++) {
//    for (int j = 1; j < 10 ; j++) {
//      System.out.printf("%d * %d = %2d\n", i, j, i*j);
//    }
//    System.out.println();
//  }
//
// 3단씩 출력
    for (int i = 2; i < 10; i += 3) {
      for (int j = 1; j < 10; j++) {
        for (int k = 0; k < 3; k++) {
          System.out.printf("%d * %d = %2d \t",
              i + k, j, (i + k) * j);
        }
        System.out.println();
      }
      System.out.println();
    }
// for문은 비교적 횟수에 대한 예측이 가능할 때
    int i = 0;
    for (; ; ) {
      System.out.println(i++);
      if (i > 10)
        break; // 자신이 속한 반복문을 벗어남
    }
    for (int k = 0, j = 0; j < 10; j++, k++) {

    }
  }
}
