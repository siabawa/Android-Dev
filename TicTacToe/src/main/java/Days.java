/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maria Ferdinand
 */
public class Days {
    public static void main(String []args){
        int a = 1;
      String tie;
      switch (a) { 
          case 1:
              tie = "monday"; 
          System.out.println("The day is " +tie);
          break;
          case 2:
           tie = "tuesday"; 
          System.out.println("The day is " +tie);
          break;
          case 3:
              tie = "wednesday"; 
          System.out.println("The day is " +tie);
          break;
          case 4:
                 tie = "thursday"; 
          System.out.println("The day is " +tie);
          break;
          case 5:
                 tie = "friday"; 
          System.out.println("The day is " +tie);
          break;
          case 6: 
                 tie = "saturday"; 
          System.out.println("The day is " +tie);
          default:
                  tie = "sunday";
                  System.out.println("The day is " +tie);
      }
    }
}
