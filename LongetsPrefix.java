package com.leetcode;

import java.util.Arrays;

public class LongetsPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(longestCommonPrefix(new String[] {"flower","flow","flight"}));

	}

	public static String longestCommonPrefix(String[] strs) {
		
		String str = "";
		boolean flag = true;
		
		String shortest = Arrays.asList(strs).stream()
		        .sorted((e2, e1) -> e1.length() > e2.length() ? -1 : 1)
		        .findFirst().get();  
        
        for(int i = 0; i < shortest.length(); i++) {
        	
        	char c = strs[0].charAt(i);
        	for(int j = 1; j < strs.length; j++) {
        		if(strs[0].charAt(i) != strs[j].charAt(i)) {
        			flag = false;
        			i = shortest.length();
                    break;
        		}
        	}
        	if(flag == true) {
        		str = str + c;
        	}
        	flag = true;
        }
        
        return str;
    }

}
