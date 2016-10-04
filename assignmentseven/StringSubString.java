package com.java.assignmentseven;

public class StringSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "codeChef";
		String subString = "deCh";
		
		System.out.println(contain(string , subString));
		
		subString = "topCoder";
		
		System.out.println(contain(string , subString));
	}

	private static boolean contain(String string, String subString) {
		// TODO Auto-generated method stub
		boolean flag = true ;
		if (string.equals(subString)) {
			return flag ;
		} else {
			int indexOfString = 0 , indexOfsubString = 0;
			while (indexOfString < string.length() && indexOfsubString < subString.length()) {
				if (subString.charAt(indexOfsubString) == string.charAt(indexOfString)) {
					++indexOfsubString;
				} 
				++indexOfString;
			}
			if (subString.length() == indexOfsubString) {
				return flag;
			} else {
				return !flag;
			}
		}
	}

}
