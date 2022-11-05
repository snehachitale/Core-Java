package com.java;

public class PatternsProgram {

	public static void main(String[] args) {
		pattern11(5);
	}
	
	static void pattern(int n) {
		for(int row = 1; row <= n; row++) {
			for(int col = 1; col <= row; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	static void pattern1(int n) {
		for(int row = 1; row <= n; row++) {
			for(int col = 1; col <= n; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	static void pattern2(int n) {
		for(int row = n; row >= 1; row--) {
			for(int col = 1; col <= row; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	static void pattern3(int n) {
		for(int row = 1; row <= n; row++) {
			for(int col = 1; col <= row; col++) {
				System.out.print(col +" ");
			}
			System.out.println();
		}
	}
	
	static void pattern4(int n) {
		for(int row = 0; row < 2 * n; row++) {
			int rowCount = row > n ? 2 * n - row : row;
			for(int col = 0; col < rowCount; col++) {
				System.out.print("* ");
			}			
			System.out.println();
		}
	}
	
	static void pattern5(int n) {
		for(int row = 1; row <= n; row++) {
			for(int spaces = n-row; spaces > 0; spaces--) {
				System.out.print(" ");
			}
			for(int col = 1; col <= row; col++) {
				System.out.print("*");
			}
			System.out.println();			
		}
	}
	
	static void pattern6(int n) {
		for(int row = n; row >= 1; row--) {
			for(int col = 1; col <= row; col++) {
				System.out.print("*");
			}
			System.out.println();	
			for(int spaces = n-row; spaces >= 0; spaces--) {
				System.out.print(" ");
			}
		}
	}
	
	static void pattern7(int n) {
		for(int row = 0; row < n; row++) {
			for(int spaces = n-row; spaces > 1; spaces--) {
				System.out.print(" ");
			}
			for(int col = 0; col <= row; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	static void pattern8(int n) {
		for(int row = n; row >= 0; row--) {
			for(int spaces = n-row; spaces >= 1; spaces--) {
				System.out.print(" ");
			}
			for(int col = 0; col <= row; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	static void pattern9(int n) {
		for(int row = n*2; row >= 0; row--) {
			int rowCount = row > n ?  row - n : n - row;
			for(int spaces = n-rowCount; spaces >= 1; spaces--) {
				System.out.print(" ");
			}
			for(int col = 0; col <= rowCount; col++) {
				System.out.print("* ");
			}			
			System.out.println();
		}
	}
	
	static void pattern10(int n) {
		for(int row = 1; row <= n*2; row++) {
			int rowCount = row > n ?  2 * n - row : row;
			for(int spaces = n-rowCount; spaces >= 0; spaces--) {
				System.out.print(" ");
			}
			for(int col = 1; col <= rowCount; col++) {
				System.out.print("* ");
			}			
			System.out.println();
		}
	}
	
	static void pattern11(int n) {
		for(int row = 1; row <= n; row++) {
			
			for(int space = 0; space < n-row; space++) {
				System.out.print("  ");
			}
			
			for(int col = row; col >= 1; col--) {
				System.out.print(col +" ");
			}
			
			for(int col = 2; col <= row; col++) {
				System.out.print(col +" ");
			}
			
			System.out.println();
		}
	}
}
