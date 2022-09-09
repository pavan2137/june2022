package LogicalPrograms;

import java.util.HashMap;
import java.util.Set;

public class find_repeating_string_in_paragraph {

	public static void main(String[] args) {
		String str = "abc abcd avcde acb abdc abdc abdcabdc abdc";
		
		//convert string into array
		String ar[] = str.split(" ");
	
	/*	for(int i=0; i<=ar.length-1; i++) {
			System.out.println(ar[i]);
		}*/
		
		//create hash map
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		 
		for(int i=0; i<=ar.length-1; i++) {
			String c1 = ar[i];
			if(map.containsKey(c1)) {
				map.put(c1, map.get(c1)+1);
			}else {
				map.put(c1, 1);
				
			}
			
		}
		System.out.println(map);
		
		Set<String> keys = map.keySet();
		System.out.println(keys); //[avcde, acb, abc, abdcabdc, abdc, abcd]
		
		for(String str1:keys) {
			System.out.println(str1+" "+map.get(str1));
		}
	}
}
