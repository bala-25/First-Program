package Collectionspractice;

import java.util.*;

public class LLpractice {

	public static void main(String[] args) {
		ArrayList<String>  y1 =  new ArrayList<>();
		LinkedList<String>  l1 = new LinkedList<>();
		l1.add("l1");
		l1.add("l2");
		l1.add("l3");
		y1.add("f1");
		y1.add("f2");
	
		l1.addAll(y1);
		System.out.println(l1);
	}

}
