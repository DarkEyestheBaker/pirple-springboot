package complexconditional;

import java.util.*;

public class ComplexConditionalClass {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String input = reader.next();
		String sOne = "abc";
		String sTwo = "z";

		if (input.contains(sOne) &&  input.contains(sTwo)){
			System.out.println("TRUE!");
		} else {
			System.out.println("FALSE!");
		}
	}
}