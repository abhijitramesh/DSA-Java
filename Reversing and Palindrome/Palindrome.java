import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		StackRAP s1 = new StackRAP();
		Scanner sc = new Scanner(System.in); 
		String name = sc.nextLine();
		boolean flag = false;
		for(int i=0;i<name.length();i++) {
			s1.push(name.charAt(i));
		}
		for(int i=0;i<name.length();i++) {
			if(s1.top.data==name.charAt(i))
			{flag = true;
			s1.pop();
			}
			else 
				flag = false;
			
		}
		if(flag == true) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
		
	}

}
