import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n = sc.nextInt();
		double m = sc.nextInt();
		System.out.println(String.format("%.9f", n/m));

		// 0.33333333333333333333333333333333
		// 0.3333333333333333
	}
}
