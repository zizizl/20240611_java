package p03_method;

import javax.swing.*;

public class Ex10while {
  public static void main(String[] args) {
//    int i = 0;
//    int sum = 0;
//    while (i < 10) {
//      sum += i++;
//    }
//    System.out.println(sum);


// while문 2단 출력
//    int i = 2;
//    int j = 1;
//    while (i < 10) {
//      while (j < 10) {
//        System.out.println(i + " * " + j + " = " + (i * j));
//        j++;
//      }
//    }


// while문 9단까지 출력
//    int i = 2;
//    int j = 1;
//    while (i < 10) {
//      while (j < 10) {
//        System.out.println(i + " * " + j + " = " + (i * j));
//        j++;
//      }
//      System.out.println();
//      j = 1;
//      i++;
//    }


  /* 숫자게임 쉬운 버전
  System.out.println("=======내 마음의 숫자를 맞추기 게임=======");
    int random = (int) (Math.random() * 100) + 1;
    while (true) {
      int answer = Integer.parseInt(JOptionPane.showInputDialog("숫자를 입력하세요"));
      if (answer > random) {
        System.out.println(answer + " 보다 작습니다.");
      } else if (answer < random) {
        System.out.println(answer + " 보다 큽니다");
      } else {
        System.out.println("@@@정답입니다!!@@@");
        break;
      }
    }*/

/*  숫자게임 어려운 버전
    System.out.println("=======내 마음의 숫자를 맞추기 게임=======");
    boolean stop = false;
    while (true) {
      int random = (int) (Math.random() * 100) + 1;
      if (stop) break;

      while (true) {
        String input = JOptionPane.showInputDialog("숫자를 입력하세요(종료하려면 Q,q)");
        if (input.toLowerCase().equals("q")) {
          stop = true;
          break;
        } else {
          int answer = Integer.parseInt(input);
          if (answer > random) {
            System.out.println(answer + " 보다 작습니다.");
          } else if (answer < random) {
            System.out.println(answer + " 보다 큽니다");
          } else {
            System.out.println("정답입니다!!!");
          }
        }
      }*/

    do {
//      int you =
      String input = JOptionPane.showInputDialog("가위(0),바위(1),보(2)중에 입력하세요");
      int me;
      try {
        me = Integer.parseInt(input);
      } catch (Exception e) {
        continue;
      }
    } while (true);


  }
}


