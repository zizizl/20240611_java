package p12_database.ui;

import javax.swing.*;

public abstract class FrmBasic extends JFrame {
  private int width, height;

  public FrmBasic(String title, int width, int height) {
    this.width = width;
    this.height = height;
    init();
    arrange();
    inflate();
  }

  public abstract void init();

  public abstract void arrange();

  public void inflate() {
    setSize(width, height); // 제이 프레임을 상속받아야 샛사이즈 사용가능
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(this);
    setVisible(true);
  }

}
