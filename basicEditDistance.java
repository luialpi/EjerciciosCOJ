
//algoritmo encontrado en https://en.wikipedia.org/wiki/Longest_common_subsequence_problem

import java.util.Scanner;

public class basicEditDistance {
	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		String palabra1 = s.next();
		String palabra2 = s.next();

		int len1 = palabra1.length();
		int len2 = palabra2.length();

		// len1+1, len2+1, because finally return dp[len1][len2]
		int[][] conteo = new int[len1 + 1][len2 + 1];

		for (int i = 0; i <= len1; i++) {
			conteo[i][0] = i;
		}

		for (int j = 0; j <= len2; j++) {
			conteo[0][j] = j;
		}


		for (int i = 0; i < len1; i++) {
			char char1 = palabra1.charAt(i);
			for (int j = 0; j < len2; j++) {
				char char2 = palabra2.charAt(j);


				if (char1 == char2) {

					conteo[i + 1][j + 1] = conteo[i][j];
				} else {
					int min = Math.min(conteo[i + 1][j] + 1,Math.min(conteo[i][j] + 1,conteo[i][j + 1] + 1));
					conteo[i + 1][j + 1] = min;
				}
			}
		}

		System.out.println(conteo[len1][len2]);
	}

}
