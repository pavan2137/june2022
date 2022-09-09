package LogicalPrograms;

public class Palindron_string {
public static void main(String[] args) {
	
	String st = "nitin";
	String rev = "";
	
	for(int i=st.length()-1; i>=0; i--) {
		 rev = rev + st.charAt(i);
	}    
	
	if(st.equals(rev)) {
		System.out.println("string is palindron");
	}else {
		System.out.println("string is not palindron");
	}
}
}
