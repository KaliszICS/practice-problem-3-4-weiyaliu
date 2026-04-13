/**
	* Lesson: Nested Ifs
	* Author: Weiya
	* Date Created: March 23, 2023
	* Date Last Modified: March 26, 2026
	*/
public class PracticeProblem {

	public static void main(String args[]) {

	}

	//1.
	public static int min(int a, int b, int c) {
		if (a < b) {
			if (a < c) {
				return a;
			}
		} else {
			if (b < c) {
				return b;
			}
		
		} return c;
	}

	//2. 
	public static boolean isLeapYear (int year) {
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					return true;
				} else {
					return false;
				}
			} else {
				return true;
			}
		} else { 
				return false;
	}

}

}
