package leetcode.solution;

public class Solution_9 {
	public boolean isPalindrome(int x) {
		if(x%10==0 && x!=0) return false;
		int revert=0;
		while(x>revert) {
			revert=10*revert+x%10;
			x=x/10;
		}
		return x==revert || x==revert/10;
	}
}
