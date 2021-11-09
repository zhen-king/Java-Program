package zhen_lab3;
import java.util.Scanner;
import java.util.Stack;
import java.util.regex.Pattern; 
public class ReverseInput { 
  
    // Method to reverse words of a String 
    static String reverseWords(String str) 
    { 
  
    	Stack<String> myStack = new Stack<String>();
        Pattern pattern = Pattern.compile("\\s"); 
  
 
        String[] temp = pattern.split(str); 
        String result = ""; 
  
 
        for (int i = 0; i < temp.length; i++) { 
            if (i == temp.length - 1) 
                result = temp[i] + result; 
            else
                result = " " + temp[i] + result; 
        } 
        return result; 
    } 
  
    // Driver methods to test above method 
    public static void main(String[] args) 
    { 
        Scanner in= new Scanner(System.in);
        System.out.println("Please type something:");
        String s1=in.nextLine();
        System.out.println("Reverse:");
        System.out.println(reverseWords(s1)); 

    } 
} 