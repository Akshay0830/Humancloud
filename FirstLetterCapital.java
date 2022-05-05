package org.stringExamples;

public class FirstLetterCapital {
	public static void main(String[] args) {
		String str2 = "you    should    do  this  for    you";
		String Replace_spaces= str2.replaceAll("\\s{2,}"," ").trim();
		System.out.println(Replace_spaces);
		String[] word = Replace_spaces.split(" ");
		
		for (String str3 : word) {
			System.out.print(str3.substring(0,1).toUpperCase()+str3.substring(1,str3.length())+" ");
			
		}
	}

}
