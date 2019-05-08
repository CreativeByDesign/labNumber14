package labNumber14;

import java.util.Scanner;

public class RoshamboApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int test = Validator.getInt(scan, "#");
		System.out.println(test);
	}

}
