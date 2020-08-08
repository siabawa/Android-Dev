/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maria Ferdinand
 */
import java.util.Scanner;
public class InputTwo {
    public static void main(String []args){
  // create an object of Scanner
  Scanner input = new Scanner(System.in);
  
  System.out.println("What is you remaining change?");   //ask question
  float number = input.nextFloat();   // take input from the user
  System.out.println("you entered"+number);  //confirm with user
  
  
System.out.println("What is the total of the two ages?");//ask question
   
  double num = input.nextDouble(); //take input from user
  
  //confirm with user
  System.out.println("you entered"+ num);  //the variable name for double
  
  System.out.println("What is the tallest object?");
  //get string input from user - ask question 
  String myNum = input.next();
  //take input from user
  //confirm with user
  System.out.println("string entered"+myNum);
  
  
  //close scanner
          
    }
}
