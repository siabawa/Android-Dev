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
         double diff = num2 - num1;  //subtraction             // list here the variables that you created: one of them is total, diff, product, divide
         double product = num2 * num1;   //multiplication
         double divide = num2 / num1; //division
         
         
         System.out.println("The total number of arithmeticoperator are " + total);
         
         System.out.println("The difference of arithmeticoperator are " + diff );   //use string concatenation as you did for the one above, hint: use your variables for the mathematical operations to occur
         System.out.println("The product of num2 * num1 " + product); //multiplication
         System.out.println("The quotient of num2 / num1 " + divide); //division
         }
    }    