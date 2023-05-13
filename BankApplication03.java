/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bankapplication03;

import java.util.Scanner;

/**
 *
 * @author monke
 */
public class BankApplication03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int option = 0;
        
        while(option != 6){
            Scanner scan = new Scanner(System.in);
            System.out.println("1.Display All Accounts");
            System.out.println("2.Open new Account");
            System.out.println("3.Cloase Existing Account");
            System.out.println("4.Desposit:");
            System.out.println("5.Withdraw");
            System.out.println("Enter option:");
            option = scan.nextInt();
            System.out.println(option);
        }
    }
    
}
