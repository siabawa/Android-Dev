/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maria Ferdinand
 */
public class UnaryOperator {
    public static void main (String [] args){
        double number = 5.2;
        double resultNumber;  
        boolean flag = false;
        
        System.out.println("the number is: " + +number);  //having the + infront of the variable makes your number positive (even tho it is already positive)
        System.out.println("the number is:" + -number);   //the plus sign between the "" and the variable is string onatenatio.... and -number makes your number negative
        
        
        System.out.println("the number is:" + ++number);    //increment your variable
        System.out.println("the number is:" + --number);   //never use a - sign for string concatenation
        System.out.println("flag =" +!flag);
    }
    
}
