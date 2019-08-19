package ninepointtwo;

import java.util.HashSet;
import java.util.Set;

public class Merger {
	public static void main(String[] args) {
		
		
		Set<Integer> set1=new HashSet<Integer>();
		for(int i=0;i<25;i++) {
			set1.add(i);
		}
		System.out.println("The first set:");
		for(Integer i:set1) {
			System.out.print(i+",");
		}
		Set<Integer> set2=new HashSet<Integer>();
		for(int i=25;i<50;i++) {
			set2.add(i);
		}
		System.out.println("The second set:");
		for(Integer i:set2) {
			System.out.print(i+",");
		}
		set1.addAll(set2);
		System.out.println("Union of these sets is:");
		for(Integer i:set1) {
			System.out.print(i+",");
		}
	}

}

