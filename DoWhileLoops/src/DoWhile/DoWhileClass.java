package DoWhile;

import java.util.*;

public class DoWhileClass {

	public static void main(String[] args) {
		System.out.print("Enter data: ");
		Scanner reader = new Scanner(System.in);
		String input;
		String all = "";
		
		do {
			input =reader.nextLine();
			all += input;
		} 
		while(!input.equals("STOP"));
		System.out.println(all);
	}
}
