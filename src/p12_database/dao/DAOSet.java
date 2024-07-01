package p12_database.dao;

import java.sql.*;

public class DAOSet {
  private Connection conn;
  private PreparedStatement pstmt;
  private Statement stmt;
  private ResultSet rs;

  public Connection ConnectDB() throws SQLException {
    String driver = "jdbc:oracle:thin:@localhost:1521:xe"; // 오라클
    String user = "db7", pass = "1234";
    conn = DriverManager.getConnection(driver, user, pass);
    return conn;
  }

  public void closeDB() {
    try {
      if (rs != null) rs.close();
      if (stmt != null) stmt.close();
      if (pstmt != null) pstmt.close();
      if (conn != null) conn.close();
      System.out.println(conn.isClosed() ? "접속종료" : "접속중");
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }
}

