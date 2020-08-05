/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maria Ferdinand
 */
import java.util.Scanner;   //importing Scanner package

public class Input {   //initializing your class named Input
    public static void main(String []args){   //do not forget to add this to run program
    // create an object of Scanner
    Scanner input = new Scanner(System.in); // name of your scanner is input
    
    System.out.println("How tall is are you?"); // is this fine?  run the file and see 
    int num = input.nextInt();  //taking the user's input and adding it to the variable num
    
    //print statement confirming the user's input
    System.out.println("you entered" + num);  
    
    //close the Scanner object, refer the end of slide 25
    input.close(); 
}
}