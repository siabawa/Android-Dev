/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maria Ferdinand
 */
public class ArithmeticOperator {
    public static void main(String []args){
         double num1 = 10.5;    //declared variables
         double num2 = 19.7;
                 
                 
         double total = num1 + num2;   //addition
         double diff = num2 - num1;  //subtraction
         double product = num2 * num1;   //multiplication
         double divide = num2 / num1;
         
         
         System.out.println("The total number of arithmeticoperator are " + total);
         System.out.println("The difference of num2 - num1 ");   //use string concatenation
         System.out.println("The product of num2 * num1");
         System.out.println("The quotient of num2 / num1");
         }
    }    