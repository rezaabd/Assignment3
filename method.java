import java.util.Scanner;

public class method {
	public static void main(String[]args) {

		output(f(input())+12);
	}

	public static int f(int x) {
		return x+1;
	}

	public static void output(int x) {
		System.out.println(x);
	}

	public static int input() {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a number:");
		return  keyboard.nextInt();
	}
	}
