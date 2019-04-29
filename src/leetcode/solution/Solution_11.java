package leetcode.solution;

public class Solution_11 {
	public int maxArea(int[] height) {
		int maxarea=0;
		int l=0,r=height.length-1;
		while(l<r) {
			int area=(r-l)*Math.min(height[l], height[r]);
			if(area>maxarea) maxarea=area;
			if(height[l]<height[r])l++;
			else r--;
		}
		
		return maxarea;
	}
}
