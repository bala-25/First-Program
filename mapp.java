 package Collectionspractice;

import java.util.*;

public class mapp {

	public static void main(String[] args) {
		
		// CREATION OF MAP
		Map<Integer,String> m = new Hashtable<>();
		
		//ADDITOIN OF ELLEMENTS
		m.put(12345, "bala");
		m.put(12346, "pavan");
		m.put(12347, "karthik");
		
		//System.out.println(m);
		
		// retrieval
		Set<Integer> keys = m.keySet();
//		for(Integer key : keys) {
//			System.out.println(key);
//			
//			//retrieval of values from the map
//			Collection<String> values =m.values();
//			for (String value : values ) {
//				System.out.println(value);
//			}
//		}
		
		//RETRIVAL OF VALUE FROM THE MAP BAESD ON AKEY
		System.out.println(m.get(12345));
		
	    for(Integer key : keys)
	    {
	    	System.out.println(key + ">>>>>>>>" +m.get(key));
	    }
		System.out.println(m);
		//deletion
		m.remove(12346);
		System.out.println(m);
		
		//verification
		System.out.println(m.containsKey(12347));
		
		
		System.out.println(m.containsValue("bala"));
	 
		
		

	}

}
