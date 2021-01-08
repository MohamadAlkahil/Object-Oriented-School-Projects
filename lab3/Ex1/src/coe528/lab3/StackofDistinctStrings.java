/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528.lab3;

/**
 *
 * @author Mohamad Alkahil
 */
import java.util.ArrayList; 
public class StackofDistinctStrings {
    
    // Overview: StacksOfDistinctStrings are mutable, bounded
    // collection of distinct strings that operate in
    // LIFO (Last-In-First-Out) order.
    //
    // The abstraction function is:
    // a) Write the abstraction function here
    // AF(c)= A stack of distinct Strings S such that
    // S={ c.items.get(0),c.items.get(1),...,c.items.get((c.items.size())-1) }
    // S.top = c.items.get((c.items.size())-1)
    //
    // The rep invariant is:
    // b) Write the rep invariant here
    // RI(c):
    // for all integers x, where 0<=x<c.items.size() such that
    // c.items.get(x).equals( a String ) == true &&
    // for all intergers i,j where 0<=i<c.items.size(), and0<=j<c.items.size() such that
    // c.items.get(i).equals( c.items.get(j) )== false &&
    // c.iteams != null 
    
    //the rep
    private ArrayList<String> items;
    
    // constructor
    
    public StackofDistinctStrings(){
        //EFFECTS: Creates a new StackOfDistinctStrings object
        items = new ArrayList<String>();
    }
    
    public void push(String element) throws Exception{
        //MODIFIES: this
        //EFFECTS: Appends the element at the top of the stack
        //         if the element is not in the stack, otherwise
        //         does nothing.
        if (element == null) throw new Exception();
        if (false==items.contains(element))
            items.add(element);
    }
    
    public String pop() throws Exception {
        //MODIFIES: this
        //EFFECTS: Removes an element from the top of the stack
        if (items.size() == 0) throw new Exception();
        return items.remove(items.size()-1);
    }
    
    public boolean repOK() {
    //EFFECTS: Returns true if the rep invariant holds for this
    //         object; otherwise returns false
    // c) Write the code for repOK() here
        for(int i=0; i<items.size();i++){
            for(int j=0;j<items.size();j++){
                if(i==j){
                    continue;
                }
                else if(items.get(i).equals(items.get(j))){
                    return false;
                }
                else if(items == null){
                    return false;
                }
                else if ((items.get(i) instanceof String) != true){
                    return false;
                }
            }
        }
    
        return true;
}
    
    public String toString(){
        //EFFECTS: Returns a string that contains the string in the 
        //         stack and the top element. Implements the 
        //         abstraction function.
        // d) Write the code for the toString() here
       String stack = "Entire stack: ";
        for(int i=0; i<items.size();i++){
            stack+=(""+items.get(i)+", ");
        }
        
        return ("Top:"+ items.get(items.size()-1)+"\n"+stack);
    }
    
    
    public static void main(String[] args) throws Exception {    
        StackofDistinctStrings a= new StackofDistinctStrings();
        a.push("ab");
        a.push("XY");
        a.pop();
        a.push("cd");
        a.push("ae");
        a.push("bd");
        a.repOK();
        System.out.println(""+a.toString());
        
        
    }
}
    

