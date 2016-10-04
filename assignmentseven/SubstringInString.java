package com.java.assignmentseven;

public class SubstringInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "codeChef";
		String subString = "code";
		if (string.contains(subString)) {
			System.out.println("String found...");
		} else {
			System.out.println("String not found ....");
		}
		
		subString = "topCoder";
		
		if (string.contains(subString)) {
			System.out.println("String found...");
		} else {
			System.out.println("String not found ....");
		}
		
	}

}
