package com.interview.programs;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccurencesCount {

	
	public static void main(String[] args) {
	
		String s ="AAABBCCC";
	    List<Character> list= s.chars().mapToObj(e->(char)e).collect(Collectors.toList());
	    System.out.println(list);
	    Map<Character,Long> map = list.stream().
	    		collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	    System.out.println(map);
	}
}
