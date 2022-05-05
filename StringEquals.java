package org.stringExamples;

public class StringEquals {
	public static void main(String[] args) {
		String str1 = new String ("pune");
		String str2 = "pune";
		String str3 = new String ("pune");
		String str4 = "pune";
		
		String str5 = str2;
		String str6 = new String (str2);
		String str7 = str3;
		
		System.out.println("str1 equals ="+str1.equals(str2));
		System.out.println("str1==str2 :"+(str1==str2));
		System.out.println("str1==str3 :"+(str1==str3));
		System.out.println("str2 equals str4 ="+str2.equals(str4));
		System.out.println("str2==str4 :"+(str2==str4));
		System.out.println("str1 equals str5 :"+str1.equals(str5));
		System.out.println("str1 equals str6 :"+ str1.equals(str6));
		System.out.println("str1 equals str7 :"+str1.equals(str7));
		System.out.println("str1==str5"+(str1==str5));
		System.out.println("str1==str6 :"+(str1==str6));
		System.out.println("str1==str7 :"+(str1==str7));
		System.out.println("str2==str7 :"+(str2==str7));
		System.out.println("str4==str7 :"+(str4==str7));
		
		}

}
