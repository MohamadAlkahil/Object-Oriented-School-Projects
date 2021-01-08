/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528.lab2;

/**
 *
 * @author kahil
 */
public class Palindrome {
    
    public Palindrome(){
        
    }
//Requires: <>     
//Modifies: <>     
//Effects:  <The method checks if the input String is a Palindrome, and returns true if it is, and false if it is not>      
    public static boolean isPalindrome(String a) { 
        try{
            if(a==null){
                throw new NullPointerException("false");
            }
        }catch(NullPointerException e){
                    return false;
                    }
        if (a.isEmpty()){
                return false;
            }
        for(int i=0; i<a.length();i++){
             if(a.charAt(i) == a.charAt(a.length()-1-i)){
                continue;
            }
            else{
                return false;
            } 
        }
    return true;
    }
   
    
    
public static void main(String[] args) {         

  if(args.length == 1) {             
        if (args[0].equals("1"))                 
            System.out.println(isPalindrome(null));             
        else if (args[0].equals("2"))                  
            System.out.println(isPalindrome(""));             
        else if (args[0].equals("3"))                  
            System.out.println(isPalindrome("deed"));             
        else if (args[0].equals("4"))                 
            System.out.println(isPalindrome("abcd"));         
    }     
}
}




