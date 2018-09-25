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
public class CalcStack {
    private int size;
    public Item head;
    
    public CalcStack(Item i)
    {
        size = 1;
        head = i;
        
    }
    public CalcStack()
    {
        size = 0;
        head = null;
    }
    public void push(Item i)
    {   
        Item count = null;
        if(this.size == 0)
        {
            this.head = i;
        }
        else{
            i.next = this.head;
            this.head = i;
        }
        this.size+=1;
    }
    public Item pop(){
        Item temp = this.head;
      
        if( this.size == 1)
        {
            this.head = null;
            
        }
        else{
            this.head=this.head.next;
        }
        this.size= this.size - 1;
        
        
        return temp;
    }
    public boolean isEmpty(){
        if(size == 0)
        {
            return true;
        }
        else{
            return false;
        }
    }
    public String empty(){
        
        while(this.size>1)
        {
            
           
            float sum = 0;
            Item operator = this.pop();
            float val1 = Float.parseFloat(this.pop().value);
            float val2 = Float.parseFloat(this.pop().value);
            
            if(operator.value.charAt(0) == '+')
            {
                sum = val1 + val2;
            }
            else if(operator.value.charAt(0) == '-')
            {
                sum = val2 - val1;
               
            }
            else if(operator.value.charAt(0) == '/')
            {
                sum = val2/val1;
            }
            else if(operator.value.charAt(0) == '*')
            {
                sum = val2*val1;
            }
            String total = Float.toString(sum);
            
            Item temp = new Item(total);
            this.push(temp);
            
        }
        String totalval = this.pop().value;
        return totalval;
    }
}
