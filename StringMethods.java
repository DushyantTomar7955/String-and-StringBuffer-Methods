package com.jspider;

public class StringMethods {

	public static void main(String[] args) {
		String s="Java is a Language";
		System.out.println("Char at index 3:"+s.charAt(3));
		System.out.println("Length of String is:"+s.length());
		System.out.println("convert string to lowercase: "+s.toLowerCase());
		System.out.println("convert string to uppercase: "+s.toUpperCase());
		String s1="        jsp       is a      institute            ";
		System.out.println("String after trim: "+s1.trim());
		System.out.println("String after concating:"+s1.concat(s));
		System.out.println("is one string contains another string "+s.contains("Hello"));
		System.out.println("Is string Starts with: "+s.startsWith("J"));
		System.out.println("Is string ends with: "+s.endsWith("j"));
		System.out.println("Equal ignore case: "+s.equalsIgnoreCase("jAVA is A laNguage"));
		System.out.println("Check index of First occurence char: "+s.indexOf('a'));
		System.out.println("check index of first occurence from index char: "+s.indexOf('a', 8));
		System.out.println("check index of first occurence of String: "+s.indexOf("is"));
		System.out.println("Check index of first occurence of String from index: "+s.indexOf("uag", 5));
		System.out.println("Return index of char which occurs last: "+s.lastIndexOf('a'));
		System.out.println("Return last index of char from index: "+s.lastIndexOf('a', 10));
		System.out.println("Return last index of String "+s.lastIndexOf("is"));
		System.out.println("return last index of string from index:"+s.lastIndexOf("Lan", 10));
		System.out.println("Replace words in String: "+s.replace('a', 'P'));
		System.out.println("Substring from String: "+s.substring(10));
		System.out.println("Substring from String with ending index: "+s.substring(3, 17));
		char c[]=s.toCharArray();
		for(char i:c) {
			System.out.print(i+" ");
		}
		System.out.println();
		String s3="Dushyant Tomar";
		String []ch=s3.split(" ");
		for(String j:ch) {
			System.out.print(j+",");
		}
		

	}

}
