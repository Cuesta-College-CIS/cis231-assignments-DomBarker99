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

		if (N1 <= N2) {
			for (int i = 0; i < N1; i++)
				result[i] = num1[i];
			for (int i = 0; i < N2; i++)
				result[i + N1] = num2[i];

		} else {
			for (int i = 0; i < N2; i++)
				result[i] = num2[i];
			for (int i = 0; i < N1; i++)
				result[i + N2] = num1[i];
		}
		for (int v : result)
			System.out.print(v + " ");
		System.out.println();
		scnr.close();
	}

}