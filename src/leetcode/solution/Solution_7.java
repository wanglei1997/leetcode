package leetcode.solution;

public class Solution_7 {
	public int reverse(int x) {
		int newNumber=0;
		while(x!=0) {
			int remainder=x%10;
			x/=10;
			if(newNumber>Integer.MAX_VALUE /10|| newNumber<Integer.MIN_VALUE/10) return 0;
			newNumber=newNumber*10+remainder;
		}
		return newNumber;
	}
}
