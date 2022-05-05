package org.stringExamples;

public class StringPractice {

	public static void main(String[] args) {
//		String str = "Ms Dhoni is captian cool";
//		To reverse a string
//		String rev="" ;
//		for(int i=str.length()-1;i>=0;i--) {
//			rev = rev +str.charAt(i);	
//		}
//		System.out.println(rev);
		
		
		
		
		
//		TO Find Vowels From the string
//		int count=0;
//		for (int i = 0;i<=str.length();i++) {
//		
//			if (str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
//				count++;
//				System.out.println("Given string contains "+str.charAt(i)+" at the index "+i);
//				System.out.println(count);
//			}
//		}
		
		
		
		
		
		
		//TO Print Fibbonacci Series
		int n1=0,n2=1;
		int sum;
		System.out.print(n1+" "+n2);
		for(int i=2;i<10;i++) {
			sum=n1+n2;
			System.out.print(" "+sum);
			n1=n2;
			n2=sum;
		}
		
		
		
		
		
		//ArmStrong Number 
//		int num=233;
//		int arm=0,rem=0;
//		int temp=num;
//		
//		while (num>0) {
//			rem = num%10;
//			arm= arm+rem*rem*rem;
//			num = num/10;
//		}
//		if(temp==arm) {
//			System.out.println("No is ArmStrong");
//			
//		}else {
//			System.out.println("No is not Armstrong");
//		}
		
		
		
		
		
		
		
		String str1 = "M2s3D5hon6i i7s ca89pt8ian c7oo5l";
//		String ar[] = str1.split(" ");
		int sum1 = 0;
//		//Spliting of  a String
//		for (String split : ar) {
//			System.out.println(split);
//		}
//		
		//SUm of Numbers
		for (int i = 0;i<str1.length();i++) {
			if(Character.isDigit(str1.charAt(i))) {
				System.out.println(str1.charAt(i));
				String ms = String.valueOf(str1.charAt(i));
				int ab = Integer.parseInt(ms);
				sum1 = sum1 + ab;
			}
		}
		
		System.out.println("Sum of total numbers="+sum1);
		
	}
	
	
		
		
		
		
//		Factorial of a Number
//	int num =6,fact=1;
//	{
//	
//	for(int i=1;i<=num;i++) {
//		fact= fact*i;
//		
//	}System.out.println("Factorial of no "+num+" ="+fact);
//	
//	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	

	}


