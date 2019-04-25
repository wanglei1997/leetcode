package leetcode.solution;

public class Solution_5 {
	public String longestPalindrome(String s) {
		if(s==null || s.length()==0) return "";
		int length=s.length();
		boolean dp[][] = new boolean[length][length];
		int max=0;
		int start=0,end=0;
		int j=0,i=0;
		for(j=0;j<length;j++) {
			for(i=0;i<=j;i++) {
				dp[i][j]=(s.charAt(i)==s.charAt(j)&&(j-i<2 || dp[i+1][j-1]));
				if(dp[i][j]) {
					if(max>j-i) {
						max=j-i;
						start=i;
						end=j;
					}
				}
			}
		}
		return s.substring(start,end+1);
		
	}
}
