package com.mycompany.app;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App {
  public static void main( String[] args ) throws SQLException, ClassNotFoundException {
    Connection conn = DriverManager.getConnection("jdbc:jtds:sqlserver://[SQL_SERVER_HOSTNAME];databaseName=[DATABASE_NAME];integratedSecurity=true;authenticationScheme=JavaKerberos;domain=[DOMAIN NAME];useNTLMv2=true","[USERNAME]","[PASSWORD]");
    Statement sta = conn.createStatement();
    String Sql = "select top 100 * from dbo.RandomTable";
    ResultSet rs = sta.executeQuery(Sql);
    while (rs.next()) {
      System.out.println(rs.getString(1));
    } 
  }
}



