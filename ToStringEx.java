package org.stringExamples;

public class ToStringEx {
	int a,b;
	public static void main(String[] args) {
		ToStringEx obj1 = new ToStringEx ();
		System.out.println(obj1.toString());
		System.out.println("obj1.a ="+obj1.a);
		System.out.println("obj1.b ="+obj1.b);
//		System.out.println(obj1);
		
		}
	
	public String toString () {
		a=80;
		b=50;
		return "Hello From Akshay";
	
	}
}

