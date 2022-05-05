package org.stringExamples;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Duplicate_String {

	public static void main(String[] args) {
		String str = "I love Ms love Ms Ms love";
//		String[] word = str.split(" ");
//		Map<String, Integer> hm = new HashMap<>();
//		for (String w : word) {
////		System.out.println(w);
//			if(hm.get(w)==null) 
//				hm.put(w, 1);
//			else 
//				hm.put(w, hm.get(w)+1);			
//		}
//		Iterator<String> temp2 = hm.keySet().iterator();
//		while(temp2.hasNext()) {
//			String temp = temp2.next();
//			if(hm.get(temp)>1) {
//				System.out.println("Duplicate Word appeared is "+temp+" and it is "+hm.get(temp)+" times");
//			}
//		}
		int c=0;
		int count;
		char [] ar = str.toCharArray();
		for(int i=0;i<ar.length;i++) {
			count=1;
			for(int j=i+1;j<ar.length;j++) {
				if(ar[i]==ar[j] && ar[i]!=' ') {
					count++;
					ar[j]='0';
				}	  
			}
			if(count > 1 && ar[i] != '0') { 
				 c++;
	                System.out.println(ar[i]+" "+c); }
		}
		System.out.println(c);
		
	}


}
