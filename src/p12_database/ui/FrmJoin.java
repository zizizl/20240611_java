package p12_database.ui;

import p12_database.controller.MainController;
import p12_database.vo.Members;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrmJoin extends FrmBasic {
  private JPanel pnlCenter, pnlSouth;
  private JTextField tfId, tfName, tfMobile;
  private JPasswordField pfPass;
  private JButton btnJoin, btnLogin;
  private JLabel[] labels;
  private String[] strings;

  public FrmJoin() {
    super("회원 가입", 250, 300);
    setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
  }

  @Override
  public void init() {
    strings = new String[] {"ID", "Password", "Name", "Mobile"};
    labels = new JLabel[strings.length];
    pnlCenter = new JPanel(new GridLayout(strings.length, 2));
    pnlCenter.setBorder(BorderFactory.createEmptyBorder(0,30, 20, 30));
    pnlSouth = new JPanel();
    for (int i = 0; i < strings.length; i++) {
      labels[i] = new JLabel(strings[i]);
    }
    tfId = new JTextField(10); tfName = new JTextField(10);
    tfMobile = new JTextField(10); pfPass = new JPasswordField(10);
    addWindowListener(new WindowAdapter() {
      @Override
      public void windowClosing(WindowEvent e) {
        int choice = JOptionPane.showConfirmDialog(null,
            "로그인으로 이동하시겠어요?", "선택하시오",
            JOptionPane.YES_NO_OPTION);
        if (choice == 0) {
          MainController.getInstance().dispatchCmd("Login",null);dispose();
        }
      }
    });
    btnJoin = new JButton("회원 가입"); btnLogin = new JButton("로그인");
    btnJoin.addActionListener(e -> {
      String id = tfId.getText();
      String pw = new String(pfPass.getPassword());
      String name = tfName.getText();
      String mobile = tfMobile.getText();
      if (id == null || id.equals("")) {
        JOptionPane.showMessageDialog(FrmJoin.this, "ID를 확인하세요");
        tfId.requestFocus();
        return;
      } else {
        boolean tmp = MainController.getInstance()
            .getMembersService().isDuplicatedId(id);
        if(tmp){
          JOptionPane.showMessageDialog(this, "중복된 ID입니다.");
          tfId.setText("");tfId.requestFocus();
          return;
        }
      }
      if (pw.equals("")) {
        JOptionPane.showMessageDialog(FrmJoin.this, "Password를 확인하세요");
        pfPass.requestFocus();
        return;
      }
      if (name.equals("")) {
        JOptionPane.showMessageDialog(FrmJoin.this, "이름을 확인하세요");
        tfName.requestFocus();
        return;
      }
      if (mobile.equals("")) {
        JOptionPane.showMessageDialog(FrmJoin.this, "Mobile을 확인하세요");
        tfMobile.requestFocus();
        return;
      }
      // 유효성검사를 완성하세요!!
      boolean result = MainController.getInstance()
          .getMembersService().insertMembers(new Members(id, pw, name, mobile));
      if (result) {
        JOptionPane.showMessageDialog(FrmJoin.this, "등록되었습니다.");
        tfName.setText("");tfId.setText("");pfPass.setText("");tfMobile.setText("");
      } else {
        JOptionPane.showMessageDialog(FrmJoin.this, "등록 실패하였습니다.");
      }

    });
    btnLogin.addActionListener(e -> {
      MainController.getInstance().dispatchCmd("Login", null);dispose();
    });
  }

  @Override
  public void arrange() {
    pnlCenter.add(labels[0]); pnlCenter.add(tfId);
    pnlCenter.add(labels[1]); pnlCenter.add(pfPass);
    pnlCenter.add(labels[2]); pnlCenter.add(tfName);
    pnlCenter.add(labels[3]); pnlCenter.add(tfMobile);
    add(pnlCenter, "Center");

    pnlSouth.add(btnJoin);   pnlSouth.add(btnLogin);
    add(pnlSouth, "South");
  }


}