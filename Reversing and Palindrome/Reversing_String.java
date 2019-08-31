import java.util.Scanner;
public class Reversing_String {

	public static void main(String[] args) {
		StackRAP s1 = new StackRAP();
		Scanner sc = new Scanner(System.in); 
		String name = sc.nextLine(); 
		for(int i=0;i<name.length();i++) {
			s1.push(name.charAt(i));
		}
		for(int i=0;i<name.length();i++) {
			s1.top();
			s1.pop();
		}
		
	}

}
