import java.util.Scanner;

public class ComplexCondtional2Class {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String input = reader.next();
		String sOne = "abc";
		String sTwo = "z";
		if (input.contains(sOne)) {
			System.out.println("TRUE!");
		} else {
			System.out.println("FALSE!");
		}
	}
}