import java.util.Scanner;

public class ComplexCondtional2Class {

	public static void main(String[] args) {
		System.out.print("Enter data: ");
		Scanner reader = new Scanner(System.in);
		String input = reader.next();
		String sOne = "abc";
		String sTwo = "z";
	
		boolean bool1 = input.contains(sOne);
		boolean bool2 = input.contains(sTwo);
		
		if ((input.contains(sOne)  &&  input.contains(sTwo)) && false) {
			System.out.println("TRUE!");
		} else {
			System.out.println("FALSE!");
		}
	}
}