package leetcode.solution;

import java.util.*;
public class Solution_6 {
	public String convert(String s, int numRows) {
		if(numRows==1) return s;
		List<StringBuilder> list=new ArrayList<>();
		for(int i=0;i<Math.min(s.length(), numRows);i++) {
			list.add(new StringBuilder());
		}
		int curRow=0;
		boolean direction=false;
		for(int i=0;i<s.length();i++) {
			list.get(curRow).append(s.charAt(i));
			if(curRow==0 || curRow==numRows-1) direction=!direction;
			
			curRow+= direction ? 1:-1;
		}
		
		StringBuilder builder=new StringBuilder();
		for(StringBuilder sb : list) {
			builder.append(sb);
		}
		
		return builder.toString();
	}
}
