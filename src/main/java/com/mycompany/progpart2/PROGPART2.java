/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.progpart2;
import java.util.Scanner;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
/**
 *
 * @author Sifiso Kubheka
 */
public class PROGPART2 {

    public static void main(String[] args) {
    //Passing the external classes
    
    
    //Declarations
    String firstname;
    String lastname;
    String username;
    String password;
    
    //Creating object for scanner
    Scanner input=new Scanner(System.in);
    
    //Creating object for JDiaolog
    JDialog dialog = new JDialog();
    dialog.setAlwaysOnTop(true);
    
    //Prompt the user to input their details
    System.out.println("Enter First Name:");
    firstname=input.next();
    
    System.out.println("Enter lastname:");
    lastname = input.next();
    
    System.out.println("Enter username:");
    username = input.next();
    
    System.out.println("Enter password:");
    password = input.next();
    
    //registering the user
    
    
    
    
    
    }
}
