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
       String sql = "SELECT * FROM accounts";
      var connect = BankConnection.connect();
      Statement statement = connect.createStatement();
      ResultSet result = statement.executeQuery(sql);
      System.out.println("accountID"+"   "+"name"+"   "+"balance"+"       "+"bankName");
      while(result.next()){
//          System.out.println("Inside loop");


          System.out.println(result.getString("accountID")+"      "+ result.getString("name")
          + "     " + result.getString("balance") + "    " + result.getString("bankName")
          );
          
        
      }
  }
    public static void main(String[] args) throws SQLException {
//        --Test execution
//        String sql = "SELECT * FROM accounts";
//      var connect = BankConnection.connect();
//      Statement statement = connect.createStatement();
//      ResultSet result = statement.executeQuery(sql);
//      System.out.println("accountID"+"   "+"name"+"   "+"balance"+"       "+"bankName");
//      while(result.next()){
////          System.out.println("Inside loop");
//
//
//          System.out.println(result.getString("accountID")+"      "+ result.getString("name")
//          + "     " + result.getString("balance") + "    " + result.getString("bankName")
//          );
//          
//        
//      }
      
    }
}
//  Account getAccount(int number )
//          
//}
