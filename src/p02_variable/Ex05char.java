package p02_variable;

import common.Utils;
import p01_class.Animal;

public class Ex05char {
  char chr;

  public static void main(String[] args) {
    char c1 = 'A'; // 65
    Utils.typeOf(c1);
    System.out.println((int) c1);
    System.out.println(c1 + c1); // 연산할 경우 int로 형변환
    Utils.typeOf(c1 + c1);
    char c2 = 'a'; // 97
    Utils.typeOf(new Animal());
    char c3 = '0'; // 48
//    char c4 = ' ';  문자가 아니여서 error

    Ex05char ex05char = new Ex05char();
    System.out.println(ex05char.chr);
    //공백의 hexa코드값은 '\u0000', ' '
    System.out.println((int) ex05char.chr);
    Utils.typeOf(ex05char.chr);
    if (ex05char.chr == '\u0000') {
      System.out.println("공백이 같습니다.");
    }

  }
}
