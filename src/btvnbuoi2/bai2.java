package btvnbuoi2;

import java.util.Scanner;

public class bai2 {
		
	public static void main(String[] args) {
			System.out.println("nhap vao 1 so:");
			Scanner scanner = new Scanner(System.in);
			int a = scanner.nextInt();
			int result = 1;
			for (int i = 1; i <= a; i++) {
				result *=i;
			}
			System.out.println("giai thua cua " + a + " la: " + result);
			scanner.close();
	}

}
