package btvnbuoi2;


public class bai3 {
	public static void main(String[] args) {
		int number = 1;
		int count = 1;
		while (count <21) {
			if(checkPrime(number)) {
			System.out.println(number);
			count++;
			}
		
		number++;
		}
	}

	public static boolean checkPrime(int number){
		if (number < 2) {
			return false;}
			else {
				for (int i = 2; i <= Math.sqrt(number);i++) {
					if (number % i==0) {
						return false;
					}
				}
			}
		return true;
		}
	}
