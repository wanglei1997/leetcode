package leetcode.solution;

public class Solution_14 {
	/* 
	 *  ·ÖÖÎ·¨
	 */
	public String longestCommonPrefix(String[] strs) {
		if(strs.length==0) return "";
		return longestCommonPrefix(strs,0,strs.length-1);
	}
	
	public String longestCommonPrefix(String[] strs,int left,int right) {
		if(left==right) return strs[left]; 
		int mid=(left+right)/2;
		String lPrefix= longestCommonPrefix(strs, left, mid);
		String rPrefix=longestCommonPrefix(strs, mid+1, right);
		int i=0;
		int min=Math.min(lPrefix.length(),rPrefix.length());
		while(i<min && lPrefix.charAt(i)==rPrefix.charAt(i)) i++;
		return lPrefix.substring(0, i);
	}
}
