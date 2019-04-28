package leetcode.solution;

public class Solution_8 {
	public int myAtoi(String str) {
		boolean sign = true;
		int number=0;
		int index=0;
		while(index<str.length()&& str.charAt(index)==' ') {
			index++;
		}
		if(index==str.length()) return number;
		if(isSign(str.charAt(index))|| isDigit(str.charAt(index))) {
			if(isSign(str.charAt(index))&&str.charAt(index)=='-') {
				sign=false;
				index++;
			}
			else if(isSign(str.charAt(index))&&str.charAt(index)=='+') {
				index++;
			}
			while(index<str.length() && isDigit(str.charAt(index))){
				number=10*number+str.charAt(index)-'0';
				index++;
				if(number>=Integer.MAX_VALUE/10 && index<str.length()&&isDigit(str.charAt(index))) {
					if(number>Integer.MAX_VALUE/10) {
						return sign?Integer.MAX_VALUE:Integer.MIN_VALUE;
					}
					if(sign&&str.charAt(index)-'7'>0) return Integer.MAX_VALUE;
					if(!sign&&str.charAt(index)-'8'>0) return Integer.MIN_VALUE;
				}
			}
			return sign?number:-1*number;
		}
		else {
			return number;
		}
	}
	
	private boolean isSign(char c) {
		return c=='+' || c=='-';
	}
	
	private boolean isDigit(char c) {
		return c<='9' && c>='0';
	}
}
