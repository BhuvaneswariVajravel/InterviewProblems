package com.interview.programs.string;

//yyeessssppplleeaassee -- find the max occ repeated char in string

public class FindMaxRepeatedChar {

	public static void main(String[] args) {
		//String str ="yyeessssppplleeaassee";
		//String str="yyeesssspppppplleeaasseeeeeeee";
		String str = "yyeeeeeeepppssslllleee";
		int count=1,prevCount=0;
		char ch =str.charAt(0);
		for(int i=0;i<str.length()-1;i++) {
			//System.out.println("charAt(i)"+str.charAt(i));
			if(str.charAt(i)== str.charAt(i+1)) {
				count++;
				if(i==str.length()-1)
					count++;

			}else {
				if(count>prevCount) {
					prevCount=count;
					ch=str.charAt(i);
				}
				count=1;
			}
		}
		if(count>prevCount) {
			prevCount=count;
			ch=str.charAt(str.length()-1);
		}
		System.out.println(ch+":"+prevCount);
	}
}
