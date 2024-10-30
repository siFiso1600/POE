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
    login kby = new login();
    task task = new task();
  
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
    String registration= kby.registerUser(firstname,lastname,username,password);
    System.out.println("Registration: "+ registration);
    
    //login user
        
    System.out.println("Enter username to login:");
    username=input.next();
    System.out.println("Enter password to login:");
    password=input.next();
       
    //dispaly  login Status
    boolean loginSuccessful= kby.loginUser(username,password);
    String loginMessage=kby.returnLoginStatus(loginSuccessful);
    System.out.println(loginMessage);
       
    //IF statements 
    if(loginSuccessful){
    JOptionPane.showMessageDialog(dialog, "Welcome to EasyKanban");
    while(loginSuccessful){
    int choice = Integer.parseInt(JOptionPane.showInputDialog("""
                                                              Enter choice: 
                                                            1. Add Tasks
                                                            2. Show report
                                                            3. Quit"""));
            
    switch (choice) {
    case 1:
    //promt user to enter tasks
    task.addTask();
    break;
    case 2:
    // if the user selects option 2
    JOptionPane.showMessageDialog(null, "coming soon");
    break;
    case 3:
    //If the user selects option 3   
    System.exit(0);
    JOptionPane.showMessageDialog(null,"Exiting EasyKanban");
    default:
    break;
    }
    input.close();
    dialog.dispose();
    }
       }
    }
}

