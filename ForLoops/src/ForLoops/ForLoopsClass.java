package ForLoops;

public class ForLoopsClass {

	public static void main(String[] args) {
//		int i = 1;
//		while(i<=100) {
//			System.out.println(i);
//			i++;
//		}
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				if (i % 5 == 0) {
					System.out.println("FizzBuzz");
				} else {
					System.out.println("Fizz");
				}
			} else if (i % 5 == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}
		}
	}
}
