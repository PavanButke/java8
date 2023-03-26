package com.java8.CoreFunctionalInterface;

import java.util.Arrays;
import java.util.List;

public class myConsumer {

	public static void main(String[] args)
	{
		List<String> list = Arrays.asList("a" , "anc","asdd");
		
		traverse(list , (String x) -> System.out.println(x.length()));
	}
	
	static<T> void traverse(List<T> list , Consumer<T> consumer)
	{
		for(T t: list)
		{
			consumer.accept(t);
		}
	}
}
