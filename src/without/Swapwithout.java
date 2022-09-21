package without;

public class Swapwithout {
	
		public static void main(String[] args) {

			int first = 5, second = 8;

			System.out.println("--Before swap the numbers--");
			System.out.println("First number = " + first);
			System.out.println("Second number = " + second);

			first = first - second;
			second = first + second;
			first = second - first;

			System.out.println("--After swap the numbers--");
			System.out.println("First number = " + first);
			System.out.println("Second number = " + second);

		}
	}

