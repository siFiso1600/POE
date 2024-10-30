/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.progpart2;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author Sifiso Kubheka
 */
public class task {
    //declarations    
    private String[] taskName;
    private int[] taskNumber;
    private String[] taskDescription;
    private String[] developerDetails;
    private int[] taskDuration;
    private String[] taskID;
    private String[] taskStatus;
    
    //Checking the task descriptions
    public boolean checkTaskDescription(String taskDescription) {
    return taskDescription.length() <= 50;
    }
    // creating the Task ID
    public String createTaskID(String taskName, String developerDetails,int taskNumber) {
    return taskName.substring(0, 2).toUpperCase() + ":" + taskNumber + ":" + developerDetails.substring(developerDetails.length() - 3).toUpperCase();
    }

    public String printTaskDetails(int details) {
    // printing all the details stored
    return "Task Status: " + taskStatus[details] + "\nDeveloper Details: " + developerDetails[details] + "\nTask Number: " + taskNumber[details] + "\nTask Name: " + taskName[details] + "\nTask Description: " + taskDescription[details] + "\nTask ID: " + taskID[details] + "\nDuration: " + taskDuration[details] + " hours";
    }

    //Return total hours
    public int returnTotalHours(int taskDuration) {
    return taskDuration;
   
    }
    //Adding tasks
    public void addTask() {
    String [] options = new String []{"To Do", "Done", "Doing"};    
    String input = JOptionPane.showInputDialog("How many tasks do you wish to enter");
    // asking for the number of tasks user wants to input
    int numTasks = 0;
    try {
        numTasks = Integer.parseInt(input);
    
    for (int count = 0; count < numTasks; count++) {
            
    taskName = new String[numTasks];
    taskName[count] = JOptionPane.showInputDialog("Enter Task Name " + (count + 1) + ":");
        
    taskNumber = new int[numTasks];
    taskNumber[count] = count;
        
    taskDescription = new String [numTasks];
    do{
    taskDescription[count] = JOptionPane.showInputDialog("Enter Task Description:");  
          
            
    // checking whether the task description meets the minimum requirements
    if(!checkTaskDescription(taskDescription[count])){
    JOptionPane.showMessageDialog(null, "Task description is too long.Please try again");
    count--;
    continue;
            }
        }
    while (taskDescription[count].length()>50);
        
    developerDetails = new String [numTasks];
    developerDetails[count] = JOptionPane.showInputDialog("Enter Developer Details:");
        
    taskDuration = new int [numTasks];
    taskDuration[count]  = Integer.parseInt( JOptionPane.showInputDialog("Enter Task Duration (in hours):"));
       
    taskID = new String [numTasks];
    taskID[count] = createTaskID(taskName[count],developerDetails[count],count);
    JOptionPane.showMessageDialog(null,"taskID"+ taskID[count]);
        
    taskStatus = new String[numTasks];
    taskStatus [count] = (String)JOptionPane.showInputDialog(null, "taskStatus: ","choose your status ",JOptionPane.QUESTION_MESSAGE,null,options,options[2]);
        
    // Printing the details of the captured tasks
    JOptionPane.showMessageDialog(null,"Tasks successfully captured:" + printTaskDetails(count)); 
    }

    }catch(NumberFormatException e){
    JOptionPane.showMessageDialog(null, "Try again");
    return;
    }

 }
 }

