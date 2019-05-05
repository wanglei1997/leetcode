package leetcode.solution;

public class Solution_12 {
	public String intToRoman(int num) {
		int []value= {1,4,5,9,10,40,50,90,100,400,500,900,1000};
		String []symbal= {"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
		int i=value.length-1;
		StringBuilder builder=new StringBuilder();
		while(num!=0) {
			while(value[i]>num) i--;
			int n=num/value[i];
			for(int j=0;j<n;j++) {
				builder.append(symbal[i]);
			}
			num=num%value[i];
		}
		return builder.toString();
	}
}
