package LogicalPrograms;

public class Prime_number {

	public static void main(String[] args) {
		
		//prime number which no. how divided by only that no. i.e 2 , 3 , 7 , 9 , 11 , 13 , 17 , 19
		
		int a = 7;
		int cont = 0;
		
		for(int i=2; i<a; i++) {
			if(a % i==0) {
				cont++;
				break;
			}
		}
		if(cont==1) {
			System.out.println("given no is not prime no");
		}else {
			System.out.println("given no is prime no");
		}
		
	}
		
	}
		

