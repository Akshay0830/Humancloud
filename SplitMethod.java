package org.stringExamples;

public class SplitMethod {
	public static void main(String[] args) {
		String str = "There is a Garden and it is Beautiful.";
		String [] ar = str.split("");
		System.out.println(ar);
		int size = str.length ();
		System.out.println(size);
		System.out.println(str.substring(0,1));
		for (int i=size-1; i>=0; i--) {
			System.out.println(str.charAt(i));
		 
		}
//		for (int i=size-1; i>=0; i--) {
//			System.out.println(str.charAt(i));
//	
				
		}

}
