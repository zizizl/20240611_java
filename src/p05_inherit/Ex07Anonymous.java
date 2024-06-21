package p05_inherit;

public class Ex07Anonymous {
  public static void main(String[] args) {
    MyButton myButton = new MyButton();
    Clikable clikable = new Clikable() {
      @Override
      public void click() {
        System.out.println("click");
      }
    };
  }
}

class MyButton implements Clikable {
  @Override
  public void click() {

  }
}

interface Clikable {
  void click();
}

