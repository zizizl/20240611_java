package p03_method;

import javax.swing.*;

public class Ex07if {
  public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//    System.out.print("숫자 입력: ");
//    int input = sc.nextInt();
//    System.out.println(input);
    String result = "";
    String score = JOptionPane.showInputDialog("점수입력하세요");
    int input = Integer.parseInt(score);

    if (input >= 90) {
      result = "A";
    } else if (input >= 80) {
      result = "B";
    } else if (input >= 70) {
      result = "C";
    } else if (input >= 60) {
      result = "D";
    } else {
      result = "F";
    }
    if (input == 100) {
      result = "A+";
    } else if (input < 60) {
      result = "F";
    } else {
      if (input % 10 >= 7) {
        result += "+";
      } else if (input % 10 >= 4) {
        result += "0";
      } else {
        result += "-";
      }
    }
    System.out.println(result + " 학점입니다");
  }
}