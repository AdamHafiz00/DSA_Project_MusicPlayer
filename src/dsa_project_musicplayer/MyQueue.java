/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa_project_musicplayer;

/**
 *
 * @author adamhafiz
 */
public class MyQueue {

   private int front;
   private int tail;
   private int size;
   private int counter; 
   private String[] queue; // Changed to String to store Song Names
   
   // Constructor
   public MyQueue() {
       front = 0;
       tail = -1;
       counter = 0;  
       size = 81;  // Max 5 songs in Up Next
       queue = new String[size]; 
   }
   
   // Add song (Enqueue)
   public void enqueue(String item) {  
      if (tail == size - 1) 
          tail = 0;
      else
          tail++;

      queue[tail] = item;  
      counter++; 	  	
   }
   
   // Remove song (Dequeue)
   public String dequeue() {  
      String temp = queue[front]; // Get the song name

      if (front == size - 1)
          front = 0;
      else
          front++; 
 
      counter--;
      return temp;		  	
   }
   
   // Check if empty
   public boolean empty() {   
       return counter == 0; 
   }
   
   // Check if full
   public boolean full() {   
       return counter == size;	
   }
   
   // Helper to see what is inside (for the GUI)
   public String toString() {
       if (empty()) return "Empty";
       String list = "";
       // Loop through the circular queue
       for (int i = 0; i < counter; i++) {
           int index = (front + i) % size;
           list += "[" + queue[index] + "] ";
       }
       return list;
   }
}
