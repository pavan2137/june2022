package LogicalPrograms;

import java.util.HashMap;
import java.util.Set;

public class count_repeting_chat_in_string_using_Hashmap {
 
	public static void main(String[] args) {
		
		String sc = "abcdaabbcccddeeeeee";
		
		HashMap<Character,Integer> map = new HashMap<Character, Integer>();
		
		for(int i=0; i<=sc.length()-1; i++) {
			char str = sc.charAt(i);
			if(map.containsKey(str)) {
				map.put(str, map.get(str)+1);
			}else {
				map.put(str, 1);
			}
		}
		System.out.println(map);
		
		Set<Character> keys = map.keySet();
		System.out.println(keys); //[a, b, c, d, e] to remove duplicate
		
		for(Character key:keys) {
			System.out.println(key +":"+ map.get(key)); // if u have duplicate
		}
	}
}
