/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package postfixcalculator;

/**
 *
 * @author adamzalzal
 */
public class Item {
    public String value;
    public Item next;
    
    public Item(String v)
    {
        value = v;
        next = null;
    }
 
}
