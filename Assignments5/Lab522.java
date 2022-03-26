import java.util.Scanner;

public class LabProgram {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		int N1 = scnr.nextInt();
		int[] num1 = new int[N1];
		for (int i = 0; i < N1; i++)
			num1[i] = scnr.nextInt();

		int N2 = scnr.nextInt();
		int[] num2 = new int[N2];
		for (int i = 0; i < N2; i++)
			num2[i] = scnr.nextInt();

		int[] result = new int[N1 + N2];

		int min_len = (N1 < N2) ? N1 : N2;

		for (int i = 0; i < min_len; i++) {
			result[2 * i] = num1[i];
			result[2 * i + 1] = num2[i];
		}
		if (min_len == num1.length) {
			for (int i = 0; i < N2 - N1; i++)
				result[i + N1 * 2] = num2[i + N1];
		} else {
			for (int i = 0; i < N1 - N2; i++)
				result[i + N2 * 2] = num1[i + N2];
		}

		for (int v : result)
			System.out.print(v + " ");
		System.out.println();
		scnr.close();
	}
}
