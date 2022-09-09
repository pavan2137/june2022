package LogicalPrograms;

import java.util.Arrays;

public class compair_two_Single_array {

	public static void main(String[] args) {
		
		int ar1[] = {10,20,30};
		int ar2[] = {10,20,30};
		int ar3[] = {20,30,40};
		
		System.out.println(Arrays.equals(ar1, ar2)); //true
		
		System.out.println(Arrays.equals(ar2, ar3)); //false
	}
}
