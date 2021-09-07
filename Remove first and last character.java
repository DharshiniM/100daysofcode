Remove first and last character of a string in Java

Given string str, the task is to write Java Program to remove the first and the last character of the string and print the modified string.

Input: Java
Output: av

Program:
 
import java.util.*;

class Test{
     public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        str = str.substring(1, str.length() - 1);
        System.out.println(str);
    }
  