package org.stringExamples;

public class MethodsofString {
	public static void main(String[] args) {
		String str = "Ms Dhoni is Best Finisher";
		String str1 = "ms dhoni is best finisher";
		int length = str.length();
		int i;
		System.out.println(length);
		System.out.println(str.charAt(0));
		for (i=0; i<length; i++){
			System.out.print(str.charAt(i));
		}
		System.out.println();
		System.out.println("*********");
		int index = str.indexOf('i');
		System.out.println("indexing of ="+index);
		System.out.println("lastIndex of =" +str.lastIndexOf('D'));
		System.out.println("contains method ="+str.contains("on"));
		System.out.println("startsWithMethod ="+str.startsWith("Dho"));
		System.out.println("EndsWith Method ="+str.endsWith("her"));
		System.out.println("To UpperCase =" +str.toUpperCase());
		System.out.println("To Lower Case ="+str.toLowerCase());
		System.out.println("Equals Ignore Case ="+str.equalsIgnoreCase(str1));
		

	}

}
