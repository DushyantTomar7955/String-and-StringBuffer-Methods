package com.jspider;
import java.util.*;

public class StringBufferMethods {
    StringBuffer sb;

    public StringBufferMethods(String s) {
        sb = new StringBuffer(s);
    }

    public int capacity() {
        return sb.capacity();
    }

    public int length() {
        return sb.length();
    }

    public char charAt(int index) {
        return sb.charAt(index);
    }

    public StringBuffer append(String s) {
        return sb.append(s);
    }

    public StringBuffer delete(int start, int end) {
        return sb.delete(start, end);
    }
    public int indexOf(String s) {
    	return sb.indexOf(s);
    }
    public int lastIndexOf(String s) {
    	return sb.lastIndexOf(s);
    }
   
    public static void main(String[] args) {
        String s = "Java is Programming Language";
        StringBufferMethods sb1 = new StringBufferMethods(s);
        System.out.println("Capacity of String is: " + sb1.capacity());
        System.out.println("Length of String is: " + sb1.length());
        System.out.println("Character at Specified index is: " + sb1.charAt(3));
        System.out.println("Append the String to the String: " + sb1.append(" By James Gosling"));
        System.out.println("Delete the Characters from String: " + sb1.delete(27, 42));
        System.out.println("Index of First Occurence: "+sb1.indexOf("Programming"));
        System.out.println("Index of First Occurrence from last: "+sb1.lastIndexOf("ang"));
        
    }
}

