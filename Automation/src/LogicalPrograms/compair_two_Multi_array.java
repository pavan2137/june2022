package LogicalPrograms;

import java.util.Arrays;

public class compair_two_Multi_array {

	public static void main(String[] args) {
		
		int ar1[][] = {{10,20},{30,40}};
		int ar2[][] = {{10,20},{30,40}};
		int ar3[][] = {{20,40},{30,60}};
		
		System.out.println(Arrays.deepEquals(ar1, ar2)); //true
		
		System.out.println(Arrays.deepEquals(ar2, ar3)); //false
	}
}
