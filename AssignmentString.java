package org.stringExamples;

public class AssignmentString {
	public static void main(String[] args) {
		int sum = 0;
		String str = "Th2e3rei35sa Gar5896de5n an33d it is B3ea4utif2u3l";
//		String ar[] = str.split("//");// forward slash is work as a "Space".
//		System.out.println(ar);
		System.out.println(str.length());
		
		
////		Split Method
//		for (String w:ar) {
//			System.out.print(w);
//		}

//		Sum of No from String
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				System.out.println(str.charAt(i));
				String a = String.valueOf(str.charAt(i));
//			 Integer  b = Integer.valueOf(a);
				int x = Integer.parseInt(a);
				sum = sum + x;
			}
		}
		System.out.println(sum);
	}

}
