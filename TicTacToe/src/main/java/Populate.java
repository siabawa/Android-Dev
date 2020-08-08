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
public class Populate {
    public static void main(String[] args){
        int a;
        int b = 0; 
        Scanner g = new Scanner(System.in); 
        System.out.print("Enter no. of elements you want in array");
        a = g.nextInt();
        int y[] = new int[a];
        System.out.println("Enter all the elements");
        for(int i = 0; i < a; i++)
        {
            y[i] = g.nextInt(); 
            b = b + y[i];
        }
        System.out.println("array is " + b);
    }
}
