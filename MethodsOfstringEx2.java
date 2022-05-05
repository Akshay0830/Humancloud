package org.stringExamples;

public class MethodsOfstringEx2 {
	public static void main(String[] args) {
		String str = "Ms Dhoni is mBest Finisher";
		String str1 = "India Won";
		String []ar = str.split(" ");
     	String str2 = " the world cup";
 		System.out.println("Replace Method ="+str.replace('m', 'z'));
		System.out.println("Replace Word ="+str.replaceAll(" is "," was "));
    	System.out.println("Joining two Strings ="+(( str1+"_"+ str2)));
		System.out.println("Concatination ="+str1.concat(str2));
		System.out.println("Sub STring ="+str.substring(8));
		 
		 }
		 
		 
		
		}


