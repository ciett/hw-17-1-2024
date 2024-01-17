package btvnbuoi2;


	import java.util.Scanner;
	
	public class bai1 {
		
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//1
		System.out.println("nhap vao chu so dau tien:");
		int a = scanner.nextInt();
		System.out.println("nhap vao chu so thu 2:");
		int b = scanner.nextInt();
		System.out.println("nhap vao chu so thu 3:");
		int c = scanner.nextInt();
		int max;
		if (a>b && a>c) { 
			max = a;}
			else if (b>c) {
				max = b;}
			else   {
				max = c;}
		System.out.println("so lon nhat la: " + max);

//2
		System.out.println("Nhap vao so diem can xet: ");
		float x = scanner.nextFloat();
		if (x>8) {
			System.out.println("gioi");}
			else if (x> 6.5) {
				System.out.println("kha");}
			else if (x>5) {
				System.out.println("trung binh");}
				else {
					System.out.println("kem'");}
	
	
	
//3
	
		System.out.println("nhap vao` 1 so: ");
		float y = scanner.nextFloat();
		if (y>0) {
			System.out.println("Positive");}
			else if (y <0) {
				System.out.println("Negative");}
				else {
					System.out.println("gia tri = 0");}
		scanner.close();
	}
	}	

	

