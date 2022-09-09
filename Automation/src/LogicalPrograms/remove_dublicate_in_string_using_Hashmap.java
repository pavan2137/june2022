package LogicalPrograms;

import java.util.HashMap;
import java.util.Set;

public class remove_dublicate_in_string_using_Hashmap {

	public static void main(String[] args) {
		 String str = "abcdaabbddeeeeyy";
		 
		 HashMap<Character, Integer> map = new HashMap<Character, Integer >();
		 
		 for(int i=0; i<=str.length()-1; i++) {
			 char sc = str.charAt(i);
			 
			 if(map.containsKey(sc)) {
				 map.put(sc, map.get(sc)+1);
			 }else {
				 map.put(sc, 1);
			 }
		 }
			Set<Character> keys = map.keySet();
			System.out.println(keys);  // [a, b, c, d, e, y] remove duplicate
		 }
	}

