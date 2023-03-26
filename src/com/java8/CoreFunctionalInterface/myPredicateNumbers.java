package com.java8.CoreFunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class myPredicateNumbers {

	public static void main(String []args)
	{
		Predicate<Integer> notSmallerThan5 = x-> x > 5;
		
		List<Integer> list = Arrays.asList(1,2,3,4,15,16,17,18);
		
		List<Integer> collect = list.stream().filter(notSmallerThan5).collect(Collectors.toList());
		
		System.out.println(collect);
	}
}
