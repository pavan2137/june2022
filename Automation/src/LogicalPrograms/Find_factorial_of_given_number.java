package LogicalPrograms;

public class Find_factorial_of_given_number {
public static void main(String[] args) {
	
	int num= 4;
	int fct = 1;
	
	for(int i=num; i>=1; i--) {//4*3*2*1 factorial
		fct=fct*i;
		
	}
	System.out.println(fct); //24
}
}
