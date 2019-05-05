package leetcode.solution;

public class Solution_13 {
	public int romanToInt(String s) {
		int length = s.length();
		int i = 0;
		int num = 0;
		while (i<length && s.charAt(i) == 'M') {
			num += 1000;
			i++;
		}
		while (i<length-1 && s.charAt(i) == 'C' && s.charAt(i + 1) == 'M') {
			num += 900;
			i+=2;
		}
		while (i<length && s.charAt(i) == 'D') {
			num += 500;
			i++;
		}
		while (i<length-1 && s.charAt(i) == 'C' && s.charAt(i + 1) == 'D') {
			num += 400;
			i+=2;
		}
		while (i<length && s.charAt(i) == 'C') {
			num += 100;
			i++;
		}
		while (i<length-1 && s.charAt(i) == 'X' && s.charAt(i + 1) == 'C') {
			num += 90;
			i+=2;
		}
		while (i<length && s.charAt(i) == 'L') {
			num += 50;
			i++;
		}
		while (i<length-1 && s.charAt(i) == 'X' && s.charAt(i + 1) == 'L') {
			num += 40;
			i+=2;
		}
		while (i<length && s.charAt(i) == 'X') {
			num += 10;
			i++;
		}
		while (i<length-1 && s.charAt(i) == 'I' && s.charAt(i + 1) == 'X') {
			num += 9;
			i+=2;
		}
		while (i<length && s.charAt(i) == 'V') {
			num += 5;
			i++;
		}
		while (i<length-1 && s.charAt(i) == 'I' && s.charAt(i + 1) == 'V') {
			num += 4;
			i+=2;
		}
		while (i<length && s.charAt(i) == 'I') {
			num += 1;
			i++;
		}
		return num;
	}
}
