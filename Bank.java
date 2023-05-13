/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankapplication03;


import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
/**
 *
 * @author monke
 */
public class Bank {
  String name;
  Connection connect;
  void openAccount(Account account){
   
}
  void closeAccount(int number){
      
  }
  void depositMoney(Account account,double amount){
      
  }
  void withdrawMoney(Account account,double amount){
      
  }
  void listAccounts() throws SQLException{
      String sql = "SELECT * FROM ";
      connect = BankConnection.connect();
      Statement statement = connect.createStatement();
      ResultSet result = statement.executeQuery(sql);
      while(result.next()){
          System.out.println(result.getString("accountID"));
      }
      
  }
    public static void main(String[] args) throws SQLException {
        String sql = "SELECT * FROM accounts";
      var connect = BankConnection.connect();
      Statement statement = connect.createStatement();
      ResultSet result = statement.executeQuery(sql);
      while(result.next()){
          System.out.print(result.getString("balance"));
        
      }
    }
}
//  Account getAccount(int number )
//          
//}
