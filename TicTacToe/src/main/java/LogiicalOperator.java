/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maria Ferdinand
 */
public class LogiicalOperator {
    public static void main(String []args){
           int number1=1, number2=2,number3=9;
           boolean result;
           result = (number1>number2)|| (number3>number1);   // here you used || , which is the OR operator
           System.out.println(result);
           
           //use the && operator here
           result = (number1>number2) && (number3>number1);
           //and then print result
           System.out.println(result);
           
           
    }
}
