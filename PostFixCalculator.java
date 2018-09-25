/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package postfixcalculator;

import java.util.Scanner;
import java.util.*;
/**
 *
 * @author adamzalzal
 */
public class PostFixCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean exit = false;
        Scanner scanner = new Scanner(System.in);
        while(!exit)
        {
            CalcStack expression = new CalcStack();
            System.out.println("Insert an expression in postfix notation. Seperate numbers and operators by a space.");
            String input = scanner.nextLine();
            String delimeters = " ";
            String[] items = input.split(delimeters);
            for(int i = 0;i<=items.length-1;i++)
            {
                Item temp = new Item(items[i]);
                expression.push(temp);
            }
            
            String answer = expression.empty();
            
            System.out.println(answer);
            
        }
    }
    
}
