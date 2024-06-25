package p05_inherit;

import common.Utils;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex10Modifier {
  // 접근 제어자(Access Modifier): public protected default private
  public String publicVar;
  protected String protectedVar; // common패키지에서 사용예
  String defaultVar;
  private String privateVar;
  // 메서드 앞에도 접근 제어자 4가지 다 붙음.

  public static void main(String[] args) {
    // private int num = 1; // 지역변수는 접근 제어자 사용불가
    // 지역변수를 익명객체에서 쓸 때 final 붙임, java8버전부터 안붙여도됨
    final int result = 10;
    new JButton().addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        System.out.println(result); // 상수라서 사용은 가능
        //result = 10; // final 붙은 지역변수는 변경불가
      }
    });
    FinalClass finalClass = new FinalClass();
    System.out.println(finalClass);
    // java10 부터 var사용 가능, 선언과 초기화 분리적용 안됨
    var name = "LSR"; // 동적 할당 가능, 단 지역변수일때!
    Utils.typeOf(name);
  }
}

// 클래스 앞에 final이 붙었을 때는 상속이 안됨
final class FinalClass {
}

class ModifierTest {

}



